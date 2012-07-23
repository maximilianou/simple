/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maximilianou
 */
@WebServlet(name = "ProductoController", urlPatterns = {"/productos/*"})
public class ProductoController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<div>");
            out.println("<h4>Servlet ProductoController at " + request.getRequestURI() + "</h4>");
            out.println("<h4>ProductoController.doGet()</h4>");
            out.println("</div>");
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
            out.println("<div>");
            out.println("<h4>Servlet ProductoController at " + request.getRequestURI() + "</h4>");
            out.println("<h4>ProductoController.doPost()</h4>");
            out.println("</div>");
        } finally {            
            out.close();
        }
    }
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<div>");
            out.println("<h4>Servlet ProductoController at " + request.getRequestURI() + "</h4>");
            out.println("<h4>ProductoController.doPut()</h4>");
            out.println("</div>");
        } finally {            
            out.close();
        }
    }
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<div>");
            out.println("<h4>Servlet ProductoController at " + request.getRequestURI() + "</h4>");
            out.println("<h4>ProductoController.doDelete()</h4>");
            out.println("</div>");
        } finally {            
            out.close();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
