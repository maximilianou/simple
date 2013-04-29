
package layer.compras.dominio;

public class Categoria {
    
    private String nombre;
    
    public Categoria(String nom){
        setNombre(nom);
    }

    @Override
    public String toString() {
        return "{ \"categoria\":\""+nombre+"\" }";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }
    
    
}
