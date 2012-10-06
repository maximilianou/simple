<%@page import="java.io.*" %>
<%
String desde = request.getParameter("desde");//////////////
out.println( "Envio:"+desde +"<br/>");	///////////////	

java.net.Socket s = new java.net.Socket("localhost",9040);//////////////

	InputStreamReader is = null;
	BufferedReader bis = null;
	OutputStreamWriter salida = null;
	BufferedWriter bsalida = null;
	try{
		salida = new OutputStreamWriter( s .getOutputStream());
		bsalida = new BufferedWriter( salida );
		bsalida.write( desde );//////////////
		bsalida.newLine();
		bsalida.flush();
		
		is = new InputStreamReader( s .getInputStream());
		bis = new BufferedReader(is);
		String msgRespuesta = bis.readLine();
		
out.println( msgRespuesta );	//////////////	
		
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