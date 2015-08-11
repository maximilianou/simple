package ejemploRest;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonaServer", urlPatterns = {"/PersonaServer"})
public class PersonaServer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Gson convierte = new Gson();
            try {
                String mensaje_respuesta = convierte.toJson(PersonaDao.getInstance().obtener());
                out.println("<h1>Servlet PersonaServer at " + request.getContextPath() + "</h1>");
                out.println(mensaje_respuesta + "</br>");
            } catch (ClassNotFoundException ex) {
                out.println("<h1>Class Not Found Exception </h1>" + ex.getMessage());
            } catch (SQLException ex) {
                out.println("<h1>SQL Exception </h1>" + ex.getMessage());
            } catch(Exception e){ e.printStackTrace();}

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

//            out.println("" + request.getReader().readLine() + "</br>");
            Gson convierte = new Gson();
            Persona p = convierte.fromJson(request.getReader().readLine(), Persona.class);
            try {
                PersonaDao.insertar(p);
                out.println("<h1>Servlet PersonaServer at " + request.getContextPath() + "</h1>");
            } catch (ClassNotFoundException ex) {
                out.println("<h1>Clase no encontrada </h1>" + ex.getMessage());
            } catch (SQLException ex) {
                out.println("<h1>SQL Exception </h1>" + ex.getMessage());
            }

        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>Servlet PersonaServer at " + request.getContextPath() + "</h1>");
        }

    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>Servlet PersonaServer at " + request.getContextPath() + "</h1>");
        }
    }

}
