package chat.etc;

import java.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
public class Config {
  Properties p = null;
  
  public void load() throws IOException{
		System.out.println("Config ...");
		URL configuraciones 
		    = new URL("http://localhost:8080/hilos2/prop.jsp");
		//Config c = new Config();
		//c.load(
		InputStream entrada = configuraciones
				   .openConnection().getInputStream(); 
	    this.p = new Properties();
	    this.p.load(entrada);
		System.out.println("Config OK");
  }
  public String get(String clave){
	  return p.getProperty(clave);
  }
  
  
  
  
  /*
  public static void main(String[]args){
	try {
		
		System.out.println("Config ...");
		URL configuraciones 
		    = new URL("http://localhost:8080/hilos2/prop.jsp");
		Config c = new Config();
		c.load( 
			configuraciones.openConnection().getInputStream() 
			);
		System.out.println( "El Port Echo["+
				c.get("service.echo.port")
				+"]"
				);

		System.out.println("Config OK");
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
  }
  */
  
}
