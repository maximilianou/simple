package msg.srv;

//import com.sun.jndi.toolkit.ctx.Continuation;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.continuation.Continuation;
import org.eclipse.jetty.continuation.ContinuationSupport;


@WebServlet(name = "TalkServlet", urlPatterns = {"/talk","/msg/talk"})
public class TalkServlet extends HttpServlet {

    class Member {
        String _name;
        Continuation _continuation;
        Queue<String> _queue = new LinkedList<String>();
    }
    Map<String, Map<String, Member>> _rooms = new HashMap<String, Map<String, Member>>();
    // Handle Ajax calls from browser
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Ajax calls are form encoded
        String action = request.getParameter("action");
        String message = request.getParameter("message");
        String username = request.getParameter("user");
        if (action.equals("join")) {
            join(request, response, username);
        } else if (action.equals("poll")) {
            poll(request, response, username);
        } else if (action.equals("talk")) {
            talk(request, response, username, message);
        }
    }

    private synchronized void join(HttpServletRequest request, HttpServletResponse response, String username)
            throws IOException {
        Member member = new Member();
        member._name = username;
        Map<String, Member> room = _rooms.get(request.getPathInfo());
        if (room == null) {
            room = new HashMap<String, Member>();
            _rooms.put(request.getPathInfo(), room);
        }
        room.put(username, member);
        response.setContentType("text/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("{action:\"join\"}");
    }
    private synchronized void poll(HttpServletRequest request, HttpServletResponse response, String username)
            throws IOException {
        Map<String, Member> room = _rooms.get(request.getPathInfo());
        if (room == null) {
            response.sendError(503);
            return;
        }
        Member member = room.get(username);
        if (member == null) {
            response.sendError(503);
            return;
        }
        synchronized (member) {
            if (member._queue.size() > 0) {
                response.setContentType("text/json;charset=utf-8");
                StringBuilder buf = new StringBuilder();
                buf.append("{\"action\":\"poll\",");
                buf.append("\"from\":\"");
                buf.append(member._queue.poll());
                buf.append("\",");
                String message = member._queue.poll();
                int quote = message.indexOf('"');
                while (quote >= 0) {
                    message = message.substring(0, quote) + '\\' + message.substring(quote);
                    quote = message.indexOf('"', quote + 2);
                }
                buf.append("\"talk\":\"");
                buf.append(message);
                buf.append("\"}");
                byte[] bytes = buf.toString().getBytes("utf-8");
                response.setContentLength(bytes.length);
                response.getOutputStream().write(bytes);
            } else {
                Continuation continuation = ContinuationSupport.getContinuation(request);
                if (continuation.isInitial()) {
                    continuation.setTimeout(20000);
                    continuation.suspend();
                    member._continuation = continuation;
                } else {
                    response.setContentType("text/json;charset=utf-8");
                    PrintWriter out = response.getWriter();
                    out.print("{action:\"poll\"}");
                }
            }
        }
    }

    private synchronized void talk(HttpServletRequest request, HttpServletResponse response, String username, String message)
            throws IOException {
        Map<String, Member> room = _rooms.get(request.getPathInfo());
        if (room != null) {
            for (Member m : room.values()) {
                synchronized (m) {
                    m._queue.add(username); // from
                    m._queue.add(message);  // talk
                    // wakeup member if polling
                    if (m._continuation != null) {
                        m._continuation.resume();
                        m._continuation = null;
                    }
                }
            }
        }
        response.setContentType("text/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("{action:\"talk\"}");
    }

    // Serve the HTML with embedded CSS and Javascript.
    // This should be static content and should use real JS libraries.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("action") != null) {
            doPost(request, response);
        } else {
            getServletContext().getNamedDispatcher("default").forward(request, response);
        }
    }
}
