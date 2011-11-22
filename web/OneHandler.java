package simple.web;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OneHandler implements HttpHandler {
       public void handle(HttpExchange t) throws IOException {
           InputStream is = t.getRequestBody();
           
           read(is); // .. read the request body
           
           String response = "This is the response  " + (new java.util.Date());
           t.sendResponseHeaders(200, response.length());
           OutputStream os = t.getResponseBody();
           //TODO: Content-Type: text/html, css, javascript, png, jpg, pdf .. MIME Types
           os.write(response.getBytes());
           os.close();
       }
       public void read(InputStream is) throws IOException{
           String info = "";
           while(is.available()>0){
               info += (char)is.read();
           }
           Logger.getLogger(OneHandler.class.getName()).log(Level.INFO, info);
       }
    
}
