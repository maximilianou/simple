package pattern.structure.f;
import java.net.*;
import java.util.*;
import java.io.*;
public class ProxyTest {
    public static void main(String[] args) {
        try {
            PagesProxy pp = new PagesProxy();
            pp.getPage("http://www.clarin.com");
            pp.getPage("http://www.lanacion.com");
            pp.getPage("http://www.ccc.uba.ar");
            pp.getPage("http://www.clarin.com");
            pp.getPage("http://www.lanacion.com");
            pp.getPage("http://www.ccc.uba.ar");
            pp.getPage("http://www.clarin.com");
            pp.getPage("http://www.lanacion.com");
            pp.getPage("http://www.ccc.uba.ar");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class PagesProxy {
    private HashMap<String, Page> paginas = new HashMap<String, Page>();
    public Page getPage(String urlp) throws MalformedURLException, IOException {
        Page p = paginas.get(urlp);
        URL url = new URL(urlp);// Cambia siempre
        URLConnection urlCon = url.openConnection();
        if (p != null) {
            System.out.println("" + urlCon.getLastModified() + ">" + p.getLastUpdate());
            if (urlCon.getLastModified() == 0 || urlCon.getLastModified() > p.getLastUpdate()) {
                paginas.put(urlp, buscarPagina(urlp, urlCon));
            } else { // En este caso no se actualizo la pagina.
            }
        } else {
            paginas.put(urlp, buscarPagina(urlp, urlCon));
        }
        return p;
    }
    public Page buscarPagina(String url, URLConnection urlCon) throws IOException {
        System.out.println("GET: [" + url + "]");
        Page p = new Page(url);
        p.setLastUpdate(urlCon.getLastModified());
        InputStreamReader isr = null;
        BufferedReader r = null; 
        try{
            isr = new InputStreamReader(urlCon.getInputStream());
            r = new BufferedReader(isr);
            if(r.ready()) {//while (r.ready()) {
                p.setContenido(p.getContenido() + r.readLine());
            }
        }finally{
            r.close();
            isr.close();
        }
        return p;
    }
}
class Page {
    private String url;
    public Page(String url) {
        this.url = url;
    }
    private long lastUpdate = 0;
    private String contenido;
    public long getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}