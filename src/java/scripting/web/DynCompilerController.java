package scripting.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DynCompilerController", urlPatterns = {"/compiler"})
public class DynCompilerController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DynCompilerController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DynCompilerController at " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet DynCompilerController at " + request.getMethod() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DynCompilerController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DynCompilerController at " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet DynCompilerController at " + request.getMethod() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
