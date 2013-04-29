package layer.compras.test;

import layer.compras.dominio.Categoria;
import layer.compras.dominio.Producto;
import layer.compras.logica.AdmCategoria;
import layer.compras.logica.AdmProducto;

public class TestCompras {

    public static void initTest() {
        System.out.println("[..]TestCompras initTest()  -- -- -- -- -- -- ");
        AdmCategoria.cargarCategorias();
        AdmProducto.cargarProductos();
        System.out.println("[OK]TestCompras initTest()  -- -- -- -- -- -- ");
    }

    
    public static void clienteTest() {
        System.out.println("[..]TestCompras clienteTest()  -- -- -- -- -- --");
        
        System.out.println("[OK]TestCompras clienteTest()  -- -- -- -- -- --");
    }

    public static void main(String[] args) {
        System.out.println("[..]TestCompras  -- -- -- -- -- --");
        
        initTest();
        
        
        //clienteTest();
        
        System.out.println("[OK]TestCompras  -- -- -- -- -- --");
    }
}
