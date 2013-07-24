package abc.clases04;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/** @author maximilianou */
public class TestAvisoColeccion {

    public static void main(String[] args) {
        System.out.println("[..] " + TestAvisoColeccion.class.getCanonicalName() + " --------");

        ArrayList<Aviso> listaAvisos = new ArrayList();
        System.out.println("Lista Size Cero: " + listaAvisos.size());

        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Coleccion de Objetos -- ");
        try {
            listaAvisos.add(new Aviso("Peras", 15, "Amarillas for Export"));
            System.out.println(listaAvisos);
            System.out.println("Lista Size Uno: " + listaAvisos.size());
            listaAvisos.add(new Aviso("Manzana", 20, "Verdes Grandes"));
            System.out.println(listaAvisos);
            listaAvisos.add(new Aviso("Lechuga", 10, "Criolla para el asadito"));
            System.out.println(listaAvisos);
            System.out.println("Lista Size Tres: " + listaAvisos.size());
            System.out.println("[OK] Coleccion de objetos cargada");

            System.out.println(" -- --- -- ");
            System.out.println(" -- Una forma de recorrer la Coleccion, Lista -- ");
            for (Aviso avisoActual : listaAvisos) {
                System.out.println(" : " + avisoActual + " : ");
            }
            System.out.println(" -- --- -- ");
            System.out.println(" -- Otra forma de recorrer la Coleccion, Lista -- ");
            for (int i = 0; i < listaAvisos.size(); i++) {
                Aviso avisoEnIndiceI = listaAvisos.get(i);
                System.out.println(" : " + i + " : " + avisoEnIndiceI + " : ");
            }

            System.out.println(" -- --- -- ");

            System.out.println(" -- Vaciamos la Coleccion, Lista -- ");

            listaAvisos.clear();
            System.out.println("Lista Size Cero: " + listaAvisos.size());
            System.out.println(listaAvisos);
 
            System.out.println(" -- --- -- ");
        } catch (Exception ex) {
            System.out.println("[ERROR] Hubo un error en la coleccion");
            ex.printStackTrace();
            Logger.getLogger(TestAvisoColeccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(" -- ------------------------------------------ -- ");


        System.out.println("[Ok] " + TestAvisoColeccion.class.getCanonicalName() + " --------");

    }
}
