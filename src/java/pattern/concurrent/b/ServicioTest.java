package pattern.concurrent.b;

import java.io.*;
import java.net.*;
import java.util.logging.*;

public class ServicioTest {

    public static void main(String[] args) {
        
        echo("Hola, esto es un mensaje desde el Cliente.");
        
        System.out.println("Matar el servicio");
        shutdown();
        System.out.println("Matado.");
    }

    public static void shutdown() {
        try {
            new Socket("localhost", 4011);
            new Socket("localhost", 4010);
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ServicioTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ServicioTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServicioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void echo(String msg) {
        try {
            Socket e = new Socket("localhost", 4010);
            InputStreamReader isr = null;
            BufferedReader br = null;
            OutputStreamWriter osw = null;
            BufferedWriter bw = null;
            try {
                isr = new InputStreamReader(e.getInputStream());
                br = new BufferedReader(isr);
                osw = new OutputStreamWriter(e.getOutputStream());
                bw = new BufferedWriter(osw);
                System.out.println("echo send: "+msg+" [DOING..]");
                bw.write(msg);
                bw.newLine();
                bw.flush();
                System.out.println("echo send: "+msg+" [DONE]");
                
                String respuesta = "";
                System.out.println("echo receive: "+respuesta+" [DOING..]");
                respuesta = br.readLine();
                System.out.println("echo receive: "+respuesta+" [DONE]");

            } catch (IOException ex) {
                Logger.getLogger(Atender.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Atender.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    isr.close();
                } catch (IOException ex) {
                    Logger.getLogger(Atender.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Atender.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    osw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Atender.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(ServicioTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServicioTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
