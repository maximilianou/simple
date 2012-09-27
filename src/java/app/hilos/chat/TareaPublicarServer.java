package app.hilos.chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.HashMap;

import app.Application;
import app.hilos.Tarea;

public class TareaPublicarServer extends Tarea {
	Socket sock;
	
	private HashMap<String, Canal> canales = null;//new HashMap<String, Canal>();
	
	  public TareaPublicarServer(String id, 
			    Socket sock, 
			    HashMap<String, Canal> canales){
		  super(id);
		  setSock(sock);
		  this.canales = canales;
	  }
	  private void setSock(Socket sock) {
		this.sock = sock;
	  }
		@Override
		public void run() {
			InputStreamReader is = null;
			BufferedReader bis = null;
			try{
				is = new InputStreamReader(sock.getInputStream());
				bis = new BufferedReader(is);
				
				String msg = bis.readLine();
				
				getElLog().add(" ("+this.getId()+"::"+msg+") ");
				//Application.getInstance()
				// TODO: Mensajes con timestamp
				// TODO: Canales
				// TODO: Cargar en una cola de mensajes de un canal,
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{ bis.close(); }catch(Exception e){e.printStackTrace();}
				try{ is.close(); }catch(Exception e){e.printStackTrace();}
				try{ sock.close(); }catch(Exception e){e.printStackTrace();}
			}
		}
}
