<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.io.*" %>
    <%@page import="java.net.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String msg = request.getParameter("m");
out.println( "Envio:"+msg +"<br/>");	///////////////	

java.net.Socket s = new java.net.Socket("localhost",9020);

	InputStreamReader is = null;
	BufferedReader bis = null;
	OutputStreamWriter salida = null;
	BufferedWriter bsalida = null;
	try{
		salida = new OutputStreamWriter( s .getOutputStream());
		bsalida = new BufferedWriter( salida );
		bsalida.write( msg );
		bsalida.newLine();
		bsalida.flush();
		
		is = new InputStreamReader( s .getInputStream());
		bis = new BufferedReader(is);
		String msgRespuesta = bis.readLine();
out.println( "Respuesta:"+msgRespuesta +"<br/>");	//////////////	
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{ bis.close(); }catch(Exception e){e.printStackTrace();}
		try{ is.close(); }catch(Exception e){e.printStackTrace();}
		try{ bsalida.close(); }catch(Exception e){e.printStackTrace();}
		try{ salida.close(); }catch(Exception e){e.printStackTrace();}
		try{ s.close(); }catch(Exception e){e.printStackTrace();}
	}

 
 
%>
</body>
</html>