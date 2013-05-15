package util;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maximilianou
 */
public class Readme {

    String salida = "README.md";
    String[] archivos = {
        "src/java/abc/clases01/README.md",
        "src/java/abc/clases01/Aviso.java",
        "src/java/abc/clases01/TestAviso.java",
        "src/java/abc/clases02/README.md",
        "src/java/abc/clases02/Aviso.java",
        "src/java/abc/clases02/TestAvisoConstructores.java",
        "src/java/abc/clases03/README.md",
        "src/java/abc/clases03/Aviso.java",
        "src/java/abc/clases03/TestAvisoExcepcion.java",
        "src/java/abc/clases04/README.md",
        "src/java/abc/clases04/Aviso.java",
        "src/java/abc/clases04/TestAvisoColeccion.java",
        "src/java/pattern/create/a/README.md",
        "src/java/pattern/create/a/Singleton.java",
        "src/java/pattern/create/b/README.md",
        "src/java/pattern/create/b/LazyInitialization.java",
        "src/java/pattern/create/c/README.md",
        "src/java/pattern/create/c/ObjectPool.java",
        "src/java/pattern/structure/f/README.md",
        "src/java/pattern/structure/f/ProxyTest.java",
        "src/java/util/README.md",
        "src/java/util/Readme.java"
    };
    FileWriter arch = null;
    BufferedWriter barch = null;

    public void inicializar() throws IOException {
        File fs = new File(salida);
        fs.delete();
        arch = new FileWriter(salida, true);
        barch = new BufferedWriter(arch);
    }

    public void exportar() {
        for (String s : archivos) {
            String p = "";
            if (!s.endsWith(salida)) {
                p = ">      ";
            }
            try {
                exportar(s, p);
            } catch (Exception ex) {
                Logger.getLogger(Readme.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("[ERROR]Readme " + ex.getMessage() + s);

            }
        }
        try {
            barch.close();
        } catch (IOException ex) {
            Logger.getLogger(Readme.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            arch.close();
        } catch (IOException ex) {
            Logger.getLogger(Readme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void exportar(String archName, String pref) throws FileNotFoundException, IOException {
        FileReader in = new FileReader(archName);
        BufferedReader bin = new BufferedReader(in);
        while (bin.ready()) {
            barch.write(pref + bin.readLine());
            barch.newLine();
        }
        barch.write("----- ");
        barch.newLine();


    }

    public static void main(String[] args) {
        System.out.println("[..]Readme");
        Readme r = new Readme();
        try {
            r.inicializar();
            r.exportar();
        } catch (IOException ex) {
            Logger.getLogger(Readme.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("[ERROR]Readme");
        }
        System.out.println("[ok]Readme");
    }
}
