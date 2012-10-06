<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="chat.Application"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Insert title here</title>
  </head>
  <body>
    <h3><a href="info.jsp" >Info</a></h3>
  
<%
Application
  .getInstance()
    .getMensajesLog()
      .put("" + request.getParameter("nombre"), 
    		      new java.util.ArrayList<String>() );
%>
  </body>
</html>