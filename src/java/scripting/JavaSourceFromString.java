package scripting;

import java.io.IOException;
import java.util.*;
import javax.tools.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaSourceFromString extends SimpleJavaFileObject {

    String code;

    JavaSourceFromString(String name, String code) {
        super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension),
                Kind.SOURCE);
        this.code = code;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) {
        return code;
    }

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Comienzo de Compilacion");
        System.out.println("-----------------------------");
        
        String nameJava = "scripting.Muestra";
        String srcJava = "package scripting;public class Muestra{public String mostrar(String s){System.out.println(s+s+s);return s+s;}}";
        JavaSourceFromString codigo = new JavaSourceFromString(nameJava, srcJava);
        System.out.println(codigo.getName());
        System.out.println(codigo.toUri());
        System.out.println(codigo.getCharContent(true));
        System.out.println(codigo.getKind());

        System.out.println("-----------------------------");
        System.out.println("Creando Misma Clase, Mismo paquete.");
        System.out.println("-----------------------------");

        JavaSourceFromString codigo2 = new JavaSourceFromString(nameJava, srcJava);
        System.out.println(codigo2.getName());
        System.out.println(codigo2.toUri());
        System.out.println(codigo2.getCharContent(true));
        System.out.println(codigo2.getKind());

        System.out.println("-----------------------------");
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> compilationUnits1 =
                Arrays.asList(codigo);
        compiler.getTask(null, fileManager, null, null, null, compilationUnits1).call();
        try {
           fileManager.close();
        } catch (IOException ex) {
            Logger.getLogger(JavaSourceFromString.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        System.out.println("Final de Compilacion");
        System.out.println("-----------------------------");
    }
}
