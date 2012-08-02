package pattern.concurrent.b;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioTest {

    public static void main(String[] args) {
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
}
