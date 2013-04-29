/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.clases01.test;

import abc.clases01.Aviso;

/**
 *
 * @author maximilianou
 */
public class TestAviso {
    public static void main(String [] args){
        System.out.println("[..] "+TestAviso.class.getCanonicalName()+" --------");
        
        System.out.println(" -- ---------------------------------------- -- ");
        System.out.println(" -- Una Instancia u Objeto de la clase Aviso -- ");
        Aviso avisoUno = new Aviso();
        avisoUno.setTitulo("Bicicleta Plegable");
        avisoUno.setDescripcion("Bicicleta Plegable, 12 kg, roja, Dahon Eco 3.");
        avisoUno.setPrecio(2000);
        
        System.out.println(avisoUno.getTitulo());
        System.out.println(avisoUno.getPrecio());
        System.out.println(avisoUno.getDescripcion());
        System.out.println(" -- ---------------------------------------- -- ");
        
        System.out.println(" -- ------------------------------------------ -- ");
        System.out.println(" -- Dos Instancias u Objetos de la clase Aviso -- ");
        Aviso avisoDos = new Aviso();
        avisoDos.setTitulo("Mountain Bike");
        avisoDos.setDescripcion("Bicicleta profesional, 7kg, 21 cambios.");
        avisoDos.setPrecio(7000);
        
        System.out.println(avisoDos.getTitulo());
        System.out.println(avisoDos.getPrecio());
        System.out.println(avisoDos.getDescripcion());
        System.out.println(" -- ---------------------------------------- -- ");

        System.out.println("[Ok] "+TestAviso.class.getCanonicalName()+" --------");
    }
}
