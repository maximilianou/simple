package abc.clases02;
import abc.clases02.Aviso;
/**
 * @author maximilianou
 */
public class TestAvisoConstructores {
       public static void main(String [] args){
        System.out.println("[....] TestAvisoConstructores  --------");
        
        System.out.println(" -- ---------------------------------------- -- ");
        System.out.println(" -- Una Instancia u Objeto de la clase Aviso -- ");
// No compila sin parametros, de forma de asegurarnos campos obligatorios.
//        Aviso avisoUno = new Aviso();
// Solo se construyen instancias con campos obligatorios
        Aviso avisoUno = new Aviso("Bicicleta Plegable", 2000);
        // atributo opcional descripcion
        avisoUno.setDescripcion("Bicicleta Plegable, 12 kg, roja, Dahon Eco 3.");
        
        System.out.println(avisoUno.getTitulo());
        System.out.println(avisoUno.getPrecio());
        System.out.println(avisoUno.getDescripcion());
        System.out.println(" -- ---------------------------------------- -- ");
        
        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Dos Instancias u Objetos de la clase Aviso -- ");
        
// No compila sin parametros, de forma de asegurarnos campos obligatorios.
//        Aviso avisoDos = new Aviso();
// Solo se construyen instancias con campos obligatorios
        Aviso avisoDos = new Aviso("Mountain Bike", 7000);
        // atributo opcional descripcion
        avisoDos.setDescripcion("Bicicleta profesional, 7kg, 21 cambios.");
        
        System.out.println(avisoDos.getTitulo());
        System.out.println(avisoDos.getPrecio());
        System.out.println(avisoDos.getDescripcion());
        System.out.println(" -- ---------------------------------------- -- ");

        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Tres Instancias u Objetos de la clase Aviso -- ");
        
// Se construyen instancias con campos obligatorios, y con opcionales como agregado.
        Aviso avisoTres = new Aviso("Long Board", 3000, "Ruedas de silicona, ideal para competencias.");
        
        System.out.println(avisoTres.getTitulo());
        System.out.println(avisoTres.getPrecio());
        System.out.println(avisoTres.getDescripcion());
        System.out.println(" -- ---------------------------------------- -- ");

        System.out.println("[ OK ] TestAvisoConstructores  --------");
    }
 
}
