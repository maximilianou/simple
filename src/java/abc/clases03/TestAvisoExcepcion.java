package abc.clases03;

import abc.clases03.Aviso;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maximilianou
 */
public class TestAvisoExcepcion {

    public static void main(String[] args) {
        System.out.println("[..] " + TestAvisoExcepcion.class.getCanonicalName() + " --------");

        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");

        Aviso avisoTres;
        try {
            // Respeta el precio positivo.
            avisoTres = new Aviso("Long Board", 3000, "Ruedas de silicona, ideal para competencias.");
            System.out.println(avisoTres.getTitulo());
            System.out.println(avisoTres.getPrecio());
            System.out.println(avisoTres.getDescripcion());
        } catch (Exception ex) {
            Logger.getLogger(TestAvisoExcepcion.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(" -- ---------------------------------------- -- ");

        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");

        Aviso avisoCuatro;
        try {
            // Respeta el precio positivo.
            avisoCuatro = new Aviso("Long Board", -10, "Ruedas de silicona, ideal para competencias.");
            System.out.println(avisoCuatro.getTitulo());
            System.out.println(avisoCuatro.getPrecio());
            System.out.println(avisoCuatro.getDescripcion());
            System.out.println(" -- [ERROR]: Test Fallido -- ");
        } catch (Exception ex) {
            System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
            //ex.printStackTrace();
            //Logger.getLogger(TestAvisoExcepcion.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(" -- ---------------------------------------- -- ");

        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");

        Aviso avisoCinco;
        try {
            // Respeta el precio positivo.
            avisoCinco = new Aviso(null, 4444, "Ruedas de silicona, ideal para competencias.");
            System.out.println(avisoCinco.getTitulo());
            System.out.println(avisoCinco.getPrecio());
            System.out.println(avisoCinco.getDescripcion());
            System.out.println(" -- [ERROR]: Test Fallido -- ");
        } catch (Exception ex) {
            System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
            //ex.printStackTrace();
            //Logger.getLogger(TestAvisoExcepcion.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(" -- ---------------------------------------- -- ");

        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Instancias u Objetos de la clase Aviso -- ");

        Aviso avisoSeis;
        try {
            // Respeta el precio positivo.
            avisoSeis = new Aviso("", 4444, "Ruedas de silicona, ideal para competencias.");
            System.out.println(avisoSeis.getTitulo());
            System.out.println(avisoSeis.getPrecio());
            System.out.println(avisoSeis.getDescripcion());
            System.out.println(" -- [ERROR]: Test Fallido -- ");
        } catch (Exception ex) {
            System.out.println(" -- [Ok]: Test Correcto por Validacion -- ");
            //ex.printStackTrace();
            //Logger.getLogger(TestAvisoExcepcion.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(" -- ---------------------------------------- -- ");


        System.out.println("[Ok] " + TestAvisoExcepcion.class.getCanonicalName() + " --------");
    }
}
