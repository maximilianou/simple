package simple.web;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShutdownHandler implements HttpHandler {
       public void handle(HttpExchange t) throws IOException {
           InputStream is = t.getRequestBody();
           
           String response = "HTTPD is shuting down in 3 seconds ";
           t.sendResponseHeaders(200, response.length());
           OutputStream os = t.getResponseBody();
           os.write(response.getBytes());
           os.close();
           t.getHttpContext().getServer().stop(3000);
       }
    
}
