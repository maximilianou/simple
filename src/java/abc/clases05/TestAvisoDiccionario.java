package abc.clases05;
import java.util.*;
/** @author maximilianou */
public class TestAvisoDiccionario {

    public static void main(String[] args) {
        System.out.println("[..] " + TestAvisoDiccionario.class.getCanonicalName() + " --------");

        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Diccionario de Objetos, Singleton -- ");
        Categoria cate1 = new Categoria("Educativo");
        Categoria cate2 = new Categoria("Consultoria");
        Categoria cate3 = new Categoria("Marketing");
        try {
            Aviso a1 = new Aviso("Curso Java", 300, cate1, "");
            Aviso a9 = new Aviso("Curso JavaScript", 250, cate1, "");
            Aviso a5 = new Aviso("Curso HTML5", 240, cate1, "");
            Aviso a4 = new Aviso("Proyecto Actualizacion Tecnica", 30000, cate2, "");
            Aviso a7 = new Aviso("Proyecto Infraestructura", 250000, cate2, "");
            Aviso a8 = new Aviso("Proyecto Integracion", 50000, cate2, "");
            Aviso a2 = new Aviso("Comunidades Sociales", 30000, cate3, "");
            Aviso a6 = new Aviso("Avisos Pagos", 250000, cate3, "");
            Aviso a3 = new Aviso("Integracion Empresas", 50000, cate3, "");

            AdministradorAvisos.getInstance().addByCategory(a7);
            AdministradorAvisos.getInstance().addByCategory(a8);
            AdministradorAvisos.getInstance().addByCategory(a9);
            AdministradorAvisos.getInstance().addByCategory(a1);
            AdministradorAvisos.getInstance().addByCategory(a2);
            AdministradorAvisos.getInstance().addByCategory(a3);
            AdministradorAvisos.getInstance().addByCategory(a4);
            AdministradorAvisos.getInstance().addByCategory(a5);
            AdministradorAvisos.getInstance().addByCategory(a6);

            Iterator<String> categoriasNombres 
                    = AdministradorAvisos.getInstance().getCategoryNames();
            while(categoriasNombres.hasNext()){
              System.out.println("....Categoria...................");
              System.out.println( 
                      AdministradorAvisos.getInstance()
                         .getAvisosByCategory(categoriasNombres.next()) );
            }
            
        } catch (Exception e) {
            System.out.println("[ER] " + e.getMessage());
        }
        System.out.println(" -- ------------------------------------------ -- ");

        System.out.println("[Ok] " + TestAvisoDiccionario.class.getCanonicalName() + " --------");

    }
}
