package app.server;

import java.net.*;

import app.hilos.TareaEchoServer;

public class EchoServer implements Runnable {
	public boolean SHUTDOWN = false;
	protected ServerSocket servidorSocket = null;
	protected int clienteId = 0;
    //public EchoServer(){}
	public EchoServer(int port) throws Exception {
		servidorSocket = new ServerSocket(port);
	}

	public void atender() throws Exception {
		while (!SHUTDOWN) {
			Socket socketPedido = servidorSocket.accept();
			TareaEchoServer tareaEcho = new TareaEchoServer("TES"
					+ (clienteId++), socketPedido);
			Thread t = new Thread(tareaEcho);
			t.start();
		}
	}

	@Override
	public void run() {
		try {
			this.atender();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
