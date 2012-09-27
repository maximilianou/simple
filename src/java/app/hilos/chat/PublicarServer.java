package app.hilos.chat;

import java.net.Socket;
import java.util.HashMap;

import app.hilos.TareaEchoServer;
import app.server.EchoServer;

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
			   = new TareaPublicarServer("TPS"
					+ (clienteId++), 
					socketPedido, 
					canales);
			
			Thread t = new Thread(tareaEcho);
			t.start();
		}
	}
}
