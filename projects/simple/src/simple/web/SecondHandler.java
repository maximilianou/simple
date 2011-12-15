package simple.web;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecondHandler implements HttpHandler {
       public void handle(HttpExchange t) throws IOException {
           InputStream is = t.getRequestBody();
           
           read(is); // .. read the request body
           
           String response = "This is the Other response  " + (new java.util.Date());
           t.sendResponseHeaders(200, response.length());
           OutputStream os = t.getResponseBody();
           os.write(response.getBytes());
           os.close();
       }
       public void read(InputStream is) throws IOException{
           String info = "";
           while(is.available()>0){
               info += (char)is.read();
           }
           Logger.getLogger(SecondHandler.class.getName()).log(Level.INFO, info);
       }    
    
}
