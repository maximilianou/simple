package compras.test;

import compras.dominio.Producto;
import compras.logica.AdmCategoria;
import compras.logica.AdmProducto;
import java.util.*;

public class TestProductos {

    public static void initTest() {
        System.out.println("TestProductos initTest() [..] -- -- -- -- -- -- ");
        AdmCategoria.cargarCategorias();
        AdmProducto.cargarProductos();
        System.out.println("TestProductos initTest() [OK] -- -- -- -- -- -- ");
    }
    
    public static void productosClavesTest() {
        System.out.println("TestProductos productosClavesTest() [..] -- -- -- -- -- --");
        Iterator<String> claves = AdmProducto.getProductos().keySet().iterator();
        while (claves.hasNext()) {
            String clave = claves.next();
            System.out.println("Clave categoria: " + clave);
        }
        System.out.println("TestProductos productosClavesTest() [OK] -- -- -- -- -- --");
    }
    
    public static void productosTest() {
        System.out.println("TestProductos productosTest() [..] -- -- -- -- -- --");
        Iterator<String> claves = AdmProducto.getProductos().keySet().iterator();
        while (claves.hasNext()) {
            String clave = claves.next();
            System.out.println("Clave categoria: " + clave);
            Iterator<Producto> productos = AdmProducto.getProductos().get(clave).iterator();
            while (productos.hasNext()) {
                Producto producto = productos.next();
                System.out.println(producto);
            }

        }
        System.out.println("TestProductos productosTest() [OK] -- -- -- -- -- --");
    }

    public static void main(String[] args) {


        TestProductos.initTest();


        TestProductos.productosClavesTest();
       TestProductos.productosTest();



    }
}
