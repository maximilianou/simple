package chat;
import chat.etc.Config;
import java.io.IOException;
import java.util.*;

import chat.canal.PublicadorSuscriptorService;
public class Application {
	
///////////////////////////////////////////////////	Singleton
	private static Application INSTANCE = null;
	private Application(){
	}
	public static Application getInstance(){
		if( INSTANCE == null ){
			INSTANCE = new Application();
		}
		return INSTANCE;
	}
///////////////////////////////////////////////////	
   private HashMap<String, ArrayList<String>> mensajesLog 
              = new HashMap<String, ArrayList<String>>();
   
    public HashMap<String, ArrayList<String>> getMensajesLog() {
		return mensajesLog;
	}
///////////////////////////////////////////////////	
    private Config conf = new Config();
    public void loadConfig(){
    	try {
			conf.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
///////////////////////////////////////////////////	
	public void loadEcho(int port) {
		chat.echo.EchoServer es;
		try {
			es = new chat.echo.EchoServer(port);
			Thread miServidor = new Thread(es);
			miServidor.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
///////////////////////////////////////////////////	
	private PublicadorSuscriptorService pubSubService = null;
    public void loadPubSub() {
      this.pubSubService = new PublicadorSuscriptorService(
    		  Integer.parseInt( 
    					conf.get("service.publicador.port") ), 
    		  Integer.parseInt( 
    					conf.get("service.suscriptor.port") )
    							);
    }
///////////////////////////////////////////////////	
  public void load(){
	loadConfig();
	loadEcho( 
		Integer.parseInt( 
			conf.get("service.echo.port") ) );
	loadPubSub();
  }
}
