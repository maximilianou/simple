package compras.logica;

import compras.dominio.Categoria;
import compras.dominio.Producto;
import java.util.*;

public class AdmProducto {

    private static TreeMap<String, List<Producto>> productosPorCategoria;

    public static TreeMap<String, List<Producto>> getProductos() {
        if (productosPorCategoria == null) {
            cargarProductos();
        }
        return productosPorCategoria;
    }

    /**
     * Obtiene los Productos desde su fuente de datos ( Archivo | SQL | JSON )
     */
    public static void cargarProductos() {
        if (productosPorCategoria == null) {
            productosPorCategoria = new TreeMap();
        } else {
            productosPorCategoria.clear();
        }
        TreeMap<String, Categoria> categorias = AdmCategoria.getCategorias();
        Iterator<String> conjuntoCategorias = categorias.keySet().iterator();

        String categoriaActual;
        List<Producto> productosCategoriaActual;
        

        categoriaActual = conjuntoCategorias.next();
        productosPorCategoria.put(categoriaActual, new ArrayList());
        productosCategoriaActual = productosPorCategoria.get(categoriaActual);
        
        productosCategoriaActual.add(new Producto("Vela Fanal", categorias.get(categoriaActual), 250));
        productosCategoriaActual.add(new Producto("Lampara 3 luces", categorias.get(categoriaActual), 1500));
        productosCategoriaActual.add(new Producto("Aromatizador Automatico", categorias.get(categoriaActual), 200));

                categoriaActual = conjuntoCategorias.next();
        productosPorCategoria.put(categoriaActual, new ArrayList());
        productosCategoriaActual = productosPorCategoria.get(categoriaActual);
        productosCategoriaActual.add(new Producto("Mate Calabaza", categorias.get(categoriaActual), 15));
        productosCategoriaActual.add(new Producto("Essen Redonda Grande", categorias.get(categoriaActual), 650));
        productosCategoriaActual.add(new Producto("Cuchillo Mango Madera", categorias.get(categoriaActual), 90));

        categoriaActual = conjuntoCategorias.next();
        productosPorCategoria.put(categoriaActual, new ArrayList());
        productosCategoriaActual = productosPorCategoria.get(categoriaActual);
        
        productosCategoriaActual.add(new Producto("Maceta Mediana", categorias.get(categoriaActual), 25));
        productosCategoriaActual.add(new Producto("Calecita", categorias.get(categoriaActual), 1200));
        productosCategoriaActual.add(new Producto("Mangera Riego", categorias.get(categoriaActual), 220));
    }
}
