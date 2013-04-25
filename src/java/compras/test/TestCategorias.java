

package compras.test;

import compras.dominio.Categoria;
import compras.logica.AdmCategoria;
import compras.logica.AdmProducto;
import java.util.*;


public class TestCategorias {
    
    public static void initTest() {
        System.out.println("[..]TestCategorias initTest()  -- -- -- -- -- -- ");
        AdmCategoria.cargarCategorias();
        AdmProducto.cargarProductos();
        System.out.println("[OK]TestCategorias initTest()  -- -- -- -- -- -- ");
    }
    
    public static void categoriaClavesTest(){
        System.out.println("[..]TestCategorias categoriaClavesTest()  -- -- -- -- -- -- ");
        TreeMap<String, Categoria> categorias = 
                AdmCategoria.getCategorias();
        Iterator<String> claves = categorias.keySet().iterator();
        while( claves.hasNext() ){
            String clave = claves.next();
            System.out.println( clave  );
        }
        System.out.println("[Ok]TestCategorias categoriaClavesTest()  -- -- -- -- -- -- ");
    }
    
    public static void categoriaTest(){
        System.out.println("[..]TestCategorias categoriaTest()  -- -- -- -- -- -- ");
        TreeMap<String, Categoria> categorias = 
                AdmCategoria.getCategorias();
        Iterator<String> claves = categorias.keySet().iterator();
        while( claves.hasNext() ){
            String clave = claves.next();
            System.out.println( clave + " - " + categorias.get(clave) );
        }
        System.out.println("[Ok]TestCategorias categoriaTest()  -- -- -- -- -- -- ");
    }
    
    public static void main(String [] args){
        TestCategorias.initTest();
        TestCategorias.categoriaClavesTest();
        TestCategorias.categoriaTest();
        
    }
}
