<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="chat.echo.*"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
El Servidor, no el humilde, el otro.
<%
	EchoServer es = new EchoServer(9020);
	//es.atender();
	out.println("<h3>El servidor está iniciando</h3>");
	Thread miServidor = new Thread(es);
	miServidor.start();
	out.println("<h3>El servidor ha sido iniciado</h3>");
	
%>	
</body>
</html>