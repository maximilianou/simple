<%@page import="chat.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%  
out.println("Inicializando Servicios...<br/>");
Application.getInstance().load(
        "http://"+
        request.getLocalAddr()+
        ":"+
        request.getLocalPort()+
        "/"+
        request.getContextPath()+
        "/chat/prop.jsp"); 
out.println("Inicializando Servicios OK!!<br/>");

%>

</body>
</html>