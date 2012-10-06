package chat.canal;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;

import chat.tareas.*;

public class TareaConsumirServer  extends Tarea {
	Socket sock;
	
	private HashMap<String, Canal> canales = null;//new HashMap<String, Canal>();
	
	  public TareaConsumirServer(String id, 
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
			OutputStreamWriter out = null;//////
			BufferedWriter bout = null;///////
			try{
				is = new InputStreamReader(sock.getInputStream());
				bis = new BufferedReader(is);
				/////////////////////////
				out = new OutputStreamWriter(sock.getOutputStream());
				bout = new BufferedWriter(out);
				
				String msg = bis.readLine();
				
				getElLog().add(" ("+this.getId()+"::"+msg+") ");
				String respuesta = "X";
				Canal canalsito = canales.get(msg);
				if( canalsito != null && 
						canalsito.getMensajes().size()>0 ){
					respuesta = canalsito.getMensajes().pop().toString();
				}
/////////////////////////
				bout.write(respuesta);
				bout.newLine();
				bout.flush();
/////////////////////////
				
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{ bis.close(); }catch(Exception e){e.printStackTrace();}
				try{ is.close(); }catch(Exception e){e.printStackTrace();}
				try{ bout.close(); }catch(Exception e){e.printStackTrace();}
				try{ out.close(); }catch(Exception e){e.printStackTrace();}
				try{ sock.close(); }catch(Exception e){e.printStackTrace();}
			}
		}

}
