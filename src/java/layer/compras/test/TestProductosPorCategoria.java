package layer.compras.test;

import layer.compras.dominio.Producto;
import layer.compras.logica.AdmProducto;
import java.util.Iterator;
import java.util.List;

public class TestProductosPorCategoria {

    public static void productosPorCategoriaTest(){
        System.out.println("TestProductosPorCategoria productosPorCategoriaTest() [..] -- -- -- -- -- -- ");
        
        Iterator<String> clavesCategoria = AdmProducto.getProductos().keySet().iterator();
        while(clavesCategoria.hasNext()){
            String claveActual = clavesCategoria.next();
            System.out.println( "=====================================");
            System.out.println( "== Categoria: "+ claveActual );
            Iterator<Producto> productosDeCateg = AdmProducto.getProductos().get(claveActual).iterator();
            while(productosDeCateg.hasNext()){
                Producto productoActual = productosDeCateg.next();
                System.out.println("   ==  " + productoActual);
            }
            System.out.println( "== Categoria: "+ claveActual + " === ");
            System.out.println( "=====================================");
            System.out.println( );
        }
        
        System.out.println("TestProductosPorCategoria productosPorCategoriaTest() [Ok] -- -- -- -- -- -- ");
    }
    
    
    public static void main(String[] args) {


        TestProductos.initTest();

        TestProductosPorCategoria.productosPorCategoriaTest();



    }
}
