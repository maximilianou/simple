package chat.tareas;
import java.net.*;
import java.io.*;
import java.util.Date;
public class TareaEchoServer extends Tarea {
	Socket sock;
  public TareaEchoServer(String id, Socket sock){
	  super(id);
	  setSock(sock);
  }
  private void setSock(Socket sock) {
	this.sock = sock;
  }
	@Override
	public void run() {
		InputStreamReader is = null;
		BufferedReader bis = null;
		OutputStreamWriter salida = null;
		BufferedWriter bsalida = null;
		try{
			is = new InputStreamReader(sock.getInputStream());
			bis = new BufferedReader(is);
			
			String msg = bis.readLine();
			
			getElLog().add(" ("+this.getId()+"::"+msg+") ");
			
			salida = new OutputStreamWriter(sock.getOutputStream());
			bsalida = new BufferedWriter( salida );
			bsalida.write( "server["+ msg +"]" );
			bsalida.newLine();
			bsalida.flush();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{ bis.close(); }catch(Exception e){e.printStackTrace();}
			try{ is.close(); }catch(Exception e){e.printStackTrace();}
			try{ bsalida.close(); }catch(Exception e){e.printStackTrace();}
			try{ salida.close(); }catch(Exception e){e.printStackTrace();}
			try{ sock.close(); }catch(Exception e){e.printStackTrace();}
		}
	}
  
  
}
