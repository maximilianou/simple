<%@page import="java.io.*" %>
<%@page import="java.net.*" %>
<%
String msg = request.getParameter("msg");
String hasta = request.getParameter("hasta");
out.println( "Envio: hasta:"+hasta+":"+msg +"<br/>");	///////////////	

java.net.Socket s = new java.net.Socket("localhost",9030);

	//InputStreamReader is = null;
	//BufferedReader bis = null;
	OutputStreamWriter salida = null;
	BufferedWriter bsalida = null;
	try{
		salida = new OutputStreamWriter( s .getOutputStream());
		bsalida = new BufferedWriter( salida );
		bsalida.write( msg );
		bsalida.newLine();
		bsalida.flush();
		
//		is = new InputStreamReader( s .getInputStream());
//		bis = new BufferedReader(is);
//		String msgRespuesta = bis.readLine();
//out.println( "Respuesta:"+msgRespuesta +"<br/>");	//////////////	
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
//		try{ bis.close(); }catch(Exception e){e.printStackTrace();}
//		try{ is.close(); }catch(Exception e){e.printStackTrace();}
		try{ bsalida.close(); }catch(Exception e){e.printStackTrace();}
		try{ salida.close(); }catch(Exception e){e.printStackTrace();}
		try{ s.close(); }catch(Exception e){e.printStackTrace();}
	}
out.println( "ENVIADO!!!: hasta:"+hasta+":"+msg +"<br/>");	///////////////	
 
%>