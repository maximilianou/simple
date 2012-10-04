<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="app.Application"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Info de Ejecucion</h1>
  <br/>
  <h3><a href="info.jsp" >Info</a></h3>
  
  <h3><a href="init.jsp" >Inicializar Servicios</a></h3>
  
  <a href="testLog.jsp?nombre=tarea1" target="_blank">Test Log tarea 1</a><br/>
  <a href="testLog.jsp?nombre=tarea2" target="_blank">Test Log tarea 2</a><br/>
  <a href="testTarea.jsp?nombre=tarea8" target="_blank">Test new Tarea 8</a><br/>
  <a href="testTarea.jsp?nombre=tarea9" target="_blank">Test new Tarea 9</a><br/>
  
  <a href="testTareaStart.jsp?nombre=Start01" target="_blank">Test new Tarea Start 01</a><br/>
  
  <a href="testTarea400.jsp?nombre=tareaX" target="_blank">Test new Tarea Stress Test 400</a><br/>
  <a href="testTarea400.jsp?nombre=tareaXXX" target="_blank">Test new Tarea Stress Test 40000</a><br/>
  <hr/>
  <a href="testInitServer.jsp" target="_blank">
  Test Inicio Server 
  </a><br/>
  <a href="testClienteEcho.jsp?m=desde cliente web" target="_blank">
  Test Echo Server -- Client
  </a><br/>
  <hr/>
  <a href="testChatServer.jsp" target="_blank">
  Test Chat Server
  </a><br/>
  
  <hr/>
  <br/>
  <% 
java.util.Iterator<String> claves 
   = Application.getInstance().getMensajesLog().keySet().iterator();
  while(claves.hasNext()){
	  String claveactual = claves.next();
	  out.println( ""
			   + claveactual
			   +" : "
			   +Application.getInstance()
			         .getMensajesLog().get(claveactual) 
			   +"<br/>");
  }
  %>
  
</body>
</html>