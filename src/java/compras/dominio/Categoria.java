
package compras.dominio;

public class Categoria {
    
    private String nombre;
    
    public Categoria(String nom){
        setNombre(nom);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoria:"+nombre+"";
    }
    
    
}
