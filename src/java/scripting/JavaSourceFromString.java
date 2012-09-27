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
        String srcJava = "package scripting;public class Muestra{"
                +"public Muestra(){System.out.println(123);}"
                +"public String mostrar(String s){System.out.println(s+s+s);return s+s;}"
                +"}";
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

        System.out.println("----------------------------- Compilar una Clase");
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);

        Iterable<? extends JavaFileObject> compilationUnits1 = Arrays.asList(codigo);
        compiler.getTask(null, fileManager, null, null, null, compilationUnits1).call();
        try {
            fileManager.close();
        } catch (IOException ex) {
            Logger.getLogger(JavaSourceFromString.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----------------------------- Compilar una Clase OK");

        System.out.println("----------------------------- Compilar Misma Clase");
        compiler = ToolProvider.getSystemJavaCompiler();
        fileManager = compiler.getStandardFileManager(null, null, null);

        Iterable<? extends JavaFileObject> compilationUnits2 = Arrays.asList(codigo2);
        compiler.getTask(null, fileManager, null, null, null, compilationUnits2).call();
        try {
            fileManager.close();
        } catch (IOException ex) {
            Logger.getLogger(JavaSourceFromString.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("----------------------------- Compilar Misma Clase OK");

        
//Error:java.lang.ClassNotFoundException: scripting.Muestra
//        try {
//            Class.forName(nameJava).newInstance();
//        } catch (InstantiationException ex) {
//            Logger.getLogger(JavaSourceFromString.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(JavaSourceFromString.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(JavaSourceFromString.class.getName()).log(Level.SEVERE, null, ex);
//        }

//Error::string:///scripting/Muestra.java:1: duplicate class: scripting.Muestra
//        System.out.println("----------------------------- Compilar Dos veces la Misma Clase");
//        JavaCompiler compiler2 = ToolProvider.getSystemJavaCompiler();
//        StandardJavaFileManager fileManager2 = compiler.getStandardFileManager(null, null, null);
//        
//        List<? extends JavaFileObject> compilationUnits2 = Arrays.asList(codigo,codigo2);
//        compiler2.getTask(null, fileManager2, null, null, null, compilationUnits2).call();
//        try {
//           fileManager2.close();
//        } catch (IOException ex) {
//            Logger.getLogger(JavaSourceFromString.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("-----------------------------");
        // Esto es un comentario nuevo
        // pero puede ser codigo

        System.out.println("-----------------------------");
        System.out.println("Final de Compilacion");
        System.out.println("-----------------------------");
    }
}
