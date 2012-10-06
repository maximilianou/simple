package chat.canal;

import java.util.HashMap;

public class PublicadorSuscriptorService {
    private HashMap<String, Canal> canales 
              = new HashMap<String, Canal>();
	public HashMap<String, Canal> getCanales() {
		return canales;
	}
	public PublicadorSuscriptorService(int portPub, int portSus){
		// Inicializa los canales
		
		// Inicializa el Publicador
		//  y le pasa al publicador los canales
		PublicarServer ps;
		try {
			ps = new PublicarServer(portPub, canales);
			Thread miServidor = new Thread(ps);
			miServidor.start();
		} catch (Exception e) {
			e.printStackTrace();
		}		

		SuscribirServer ss;
		try {
			ss = new SuscribirServer(portSus, canales);
			Thread miServidor = new Thread(ss);
			miServidor.start();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
		
		// Inicializa el Suscriptor
		//  y le pasa al suscriptor los canales
		
	}
	
}
