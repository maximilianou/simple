package pattern.concurrent.b;
import java.net.*;
import java.io.*;
import java.util.logging.*;
public class Atender implements Runnable{
    private Socket atencion;
    public Atender(){
    }
    public void setAtencion(Socket s){
        this.atencion = s;
    }
    public void run(){
        InputStreamReader isr = null;
        BufferedReader br = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            isr = new InputStreamReader( atencion.getInputStream() );
            br = new BufferedReader(isr);
            osw = new OutputStreamWriter( atencion.getOutputStream() );
            bw = new BufferedWriter(osw);
            String msg = br.readLine();
            bw.write(msg);
            bw.flush();
        } catch (IOException ex) {
            Logger.getLogger(Atender.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
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
    }
}
