<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="chat.*"%>
<%@page import="chat.tareas.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Tarea tareaActual = new Tarea(request.getParameter("nombre"));
	Thread t = new Thread(tareaActual);
	t.start();
	out.println("Hilo del Jsp llamado: "
			+ new java.util.Date(System.currentTimeMillis()));
%>

</body>
</html>