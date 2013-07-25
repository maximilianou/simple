package abc.clases03;
import abc.clases03.Aviso;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author maximilianou
 */
public class TestAvisoExcepcion {

    public static void main(String[] args) {
        System.out.println("[....]TestAvisoExcepcion --------");
        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
        Aviso avisoTres;
        try {
            // Respeta el precio positivo.
            avisoTres = new Aviso("Long Board", 3000, "Ruedas de silicona, ideal para competencias.");
            System.out.println(avisoTres.getTitulo());
            System.out.println(avisoTres.getPrecio());
            System.out.println(avisoTres.getDescripcion());
            System.out.println(" -- [Ok]: Test Correcto, datos validos. -- ");
        } catch (Exception ex) {
            System.out.println(" -- [Error]: Test Correcto por Validacion -- ");
        }
        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
        Aviso avisoCuatro;
        try {
            // NO Respeta el precio positivo.
            avisoCuatro = new Aviso("Long Board", -10, "Ruedas de silicona, ideal para competencias.");
            System.out.println(avisoCuatro.getTitulo());
            System.out.println(avisoCuatro.getPrecio());
            System.out.println(avisoCuatro.getDescripcion());
            System.out.println(" -- [ERROR]: Test Fallido, datos invalidos -- ");
        } catch (Exception ex) {
            System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
            //ex.printStackTrace();
        }
        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
        Aviso avisoCinco;
        try {
            // NO Respeta el titulo. No puede ser null
            avisoCinco = new Aviso(null, 4444, "Ruedas de silicona, ideal para competencias.");
            System.out.println(avisoCinco.getTitulo());
            System.out.println(avisoCinco.getPrecio());
            System.out.println(avisoCinco.getDescripcion());
            System.out.println(" -- [ERROR]: Test Fallido -- ");
        } catch (Exception ex) {
            System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
            //ex.printStackTrace();
        }
        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");
        Aviso avisoSeis;
        try {
            // NO Respeta el titulo. Tiene que tener un titulo legible.
            avisoSeis = new Aviso("", 4444, "Ruedas de silicona, ideal para competencias.");
            System.out.println(avisoSeis.getTitulo());
            System.out.println(avisoSeis.getPrecio());
            System.out.println(avisoSeis.getDescripcion());
            System.out.println(" -- [ERROR]: Test Fallido -- ");
        } catch (Exception ex) {
            System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
            //ex.printStackTrace();
        }
        System.out.println(" -- ---------------------------------------- -- ");
        System.out.println("[ OK ]TestAvisoExcepcion --------");
    }
}
