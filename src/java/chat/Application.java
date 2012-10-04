package chat;
import java.io.IOException;
import java.util.*;
import chat.etc.*;
import chat.echo.*;

import chat.canal.PublicadorSuscriptorService;
import chat.pool.PoolDeConexiones;
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
    public void loadConfig(String urlConfig){
    	try {
			conf.load(urlConfig);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
///////////////////////////////////////////////////	
	public void loadEcho(int port) {
		EchoServer es;
		try {
			es = new EchoServer(port);
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
    public PublicadorSuscriptorService getPubSubService(){
    	return pubSubService;
    }
///////////////////////////////////////////////////	
    private PoolDeConexiones poolDeConexiones = new PoolDeConexiones();
    private void loadPoolDeConexiones(int cantCon) {
    	try {
			poolDeConexiones.inicializarPool(cantCon);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
    public PoolDeConexiones getPool(){
    	return poolDeConexiones;
    }
///////////////////////////////////////////////////	
    
  public void load(String urlConfig){
	loadConfig(urlConfig);
	//loadPoolDeConexiones(5);
	loadEcho( 
		Integer.parseInt( 
			conf.get("service.echo.port") ) );
	loadPubSub();
  }
}
