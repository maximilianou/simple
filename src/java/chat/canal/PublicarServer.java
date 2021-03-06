package chat.canal;

import java.net.Socket;
import java.util.HashMap;

import chat.tareas.TareaEchoServer;
import chat.echo.EchoServer;

public class PublicarServer extends EchoServer {
	
	private HashMap<String, Canal> canales = null;//new HashMap<String, Canal>();
	public PublicarServer(int port, 
			HashMap<String, Canal> canales) throws Exception{
		super(port);
		this.canales = canales;
	}

	@Override
	public void atender() throws Exception {
		while (!SHUTDOWN) {
			Socket socketPedido = servidorSocket.accept();
			TareaPublicarServer tareaEcho 
			   = new TareaPublicarServer("TPP"
					+ (clienteId++), 
					socketPedido, 
					canales);
			
			Thread t = new Thread(tareaEcho);
			t.start();
		}
	}
}
