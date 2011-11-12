package simple.web;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * TODO: Look here if you want more http://java-source.net/open-source/web-servers
 * 
 * By the way, let's go simple, JDK 6. Reference:
 * 1. https://blogs.oracle.com/michaelmcm/entry/http_server_api_in_java
 * 2. http://download.oracle.com/javase/6/docs/jre/api/net/httpserver/spec/index.html
 * 3. http://download.oracle.com/javase/6/docs/jre/api/net/httpserver/spec/index.html?com/sun/net/httpserver/HttpServer.html
 * 4. http://download.oracle.com/javase/6/docs/jre/api/net/httpserver/spec/index.html?com/sun/net/httpserver/HttpsServer.html
 * 5. http://download.oracle.com/javase/6/docs/jre/api/net/httpserver/spec/index.html?com/sun/net/httpserver/HttpHandler.html
 * 6. http://download.oracle.com/javase/6/docs/jre/api/net/httpserver/spec/index.html?com/sun/net/httpserver/HttpContext.html
 * 7. http://download.oracle.com/javase/6/docs/api/index.html?java/util/concurrent/Executor.html
 */
public class WebSimple {

    public static void main(String[] args) {
        HttpServer httpd = null;
        try {
            int port = 8888;
            httpd = HttpServer.create(new InetSocketAddress(port), 0);

//TODO: http://download.oracle.com/javase/6/docs/api/index.html?java/util/concurrent/Executors.html
            httpd.createContext("/app", new OneHandler());
            httpd.createContext("/yaura", new SecondHandler());
            httpd.createContext("/service", new SecondHandler());
            httpd.createContext("/shutdown", new ShutdownHandler());
            httpd.setExecutor(null); // creates a default executor            
            httpd.start();
            Logger.getLogger(WebSimple.class.getName()).log(Level.INFO, "Started into: "+port);
            while(true){
                try {
                    Thread.sleep(3000);
                    Logger.getLogger(WebSimple.class.getName()).log(Level.INFO, "Running into: "+port);
                } catch (InterruptedException ex) {
                    Logger.getLogger(WebSimple.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(WebSimple.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            httpd.stop(1);
        }


    }
}
