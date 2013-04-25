package compras.logica;

import compras.dominio.Categoria;
import java.util.*;

public class AdmCategoria {
    // TreeMap es un Diccionario (clave, valor), para cada clave tiene un valor.
    private static TreeMap<String, Categoria> categorias;
    
    public static TreeMap<String, Categoria> getCategorias() {
        if(categorias == null){
            cargarCategorias();
        }
        return categorias;
    }
    /** 
     * Obtiene las Categorias desde su fuente de datos ( Archivo | SQL | JSON )
     */
    public static void cargarCategorias(){
        if( categorias == null){
            categorias = new TreeMap();
        }else{
            categorias.clear();
        }
        Categoria categoriaActual;
        categoriaActual = new Categoria("Cocina");
        categorias.put(categoriaActual.getNombre(), categoriaActual);
        
        categoriaActual = new Categoria("Living");
        categorias.put(categoriaActual.getNombre(), categoriaActual);
        
        categoriaActual = new Categoria("Patio");
        categorias.put(categoriaActual.getNombre(), categoriaActual);
        
        categoriaActual = new Categoria("Balcon");
        categorias.put(categoriaActual.getNombre(), categoriaActual);
        
    }
}
