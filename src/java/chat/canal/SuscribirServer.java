package chat.canal;

import java.net.Socket;
import java.util.HashMap;

import chat.echo.*;

public class SuscribirServer  extends EchoServer {
	private HashMap<String, Canal> canales = null;//new HashMap<String, Canal>();
	public SuscribirServer(int port, 
			HashMap<String, Canal> canales) throws Exception{
		super(port);
		this.canales = canales;
	}

	@Override
	public void atender() throws Exception {
		while (!SHUTDOWN) {
			Socket socketPedido = servidorSocket.accept();
			TareaConsumirServer tareaEcho 
			   = new TareaConsumirServer("TPC"
					+ (clienteId++), 
					socketPedido, 
					canales);
			
			Thread t = new Thread(tareaEcho);
			t.start();
		}
	}
}
