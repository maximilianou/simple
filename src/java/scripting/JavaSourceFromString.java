package scripting;
import javax.tools.*;
import java.net.*;
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

        JavaSourceFromString codigo = new JavaSourceFromString("scripting.Muestra", "package scripting;public class Muestra{public String mostrar(Stirng s){System.out.println(s+s+s);return s+s;}}");
        System.out.println(codigo.getName());
        System.out.println(codigo.toUri());
        System.out.println(codigo.getCharContent(true));
        System.out.println(codigo.getKind());
        
        System.out.println("-----------------------------");
        System.out.println("Creando Misma Clase, Mismo paquete.");
        System.out.println("-----------------------------");
        
        JavaSourceFromString codigo2 = new JavaSourceFromString("scripting.Muestra", "package scripting;public class Muestra{public String mostrar(Stirng s){System.out.println(s+s+s);return s+s;}}");
        System.out.println(codigo2.getName());
        System.out.println(codigo2.toUri());
        System.out.println(codigo2.getCharContent(true));
        System.out.println(codigo2.getKind());
        
        System.out.println("-----------------------------");
        System.out.println("Final de Compilacion");
        System.out.println("-----------------------------");
    }
}
