<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="app.*"%>
    <%@page import="app.hilos.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Tarea</title>
</head>
<body>
<h1>Test Tarea</h1>
  <h3><a href="info.jsp" >Info</a></h3>

<%
Tarea tareaActual = new Tarea(request.getParameter("nombre"));

out.println(request.getParameter("nombre"));
out.println("<br/>");
out.println(tareaActual.getId());

%>

</body>
</html>