package pattern.concurrent.b;
import java.io.*;
import java.net.*;
import java.util.logging.*;
public class Servicio implements Runnable {
    private int port;
    private String atendedor;
    private boolean SHUTDOWN = false;
    private ServerSocket servShutdown = null;
    public Servicio(int p, String atendedor) {
        this.port = p;
        this.atendedor = atendedor;
    }
    public void run() {
        ServerSocket serv = null;
        try {
            servShutdown = new ServerSocket(port+1);
            serv = new ServerSocket(port);
            new Thread(){
                public void run(){
                  System.out.println("Server: Escuchando Control");
                    try {
                        Socket a = servShutdown.accept();
                    } catch (IOException ex) {
                        Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  System.out.println("Server: Shutdown..");
                  SHUTDOWN = true;
                }
            }.start();
            while(!SHUTDOWN){
                System.out.println("Server: Escuchando");
                Socket atender = serv.accept();
                System.out.println("Server: Atendiendo..");
                Atender r = (Atender) Class.forName(atendedor).newInstance();
                r.setAtencion(atender);
                Thread t = new Thread(r);
                t.start();
            }            
            System.out.println("Server: Shutdown !!!!");
        } catch (InstantiationException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                serv.close();
            } catch (IOException ex) {
                Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args) {
        Thread t = new Thread(new Servicio(4010,"pattern.concurrent.b.Atender"));
        t.start();
    }
}
