
package layer.compras.dominio;


public class Producto {
    private String nombre;
    private Categoria categoria;
    private double precio;
    public Producto(String nom, Categoria cat, double prec){
        setNombre(nom);
        setCategoria(cat);
        setPrecio(prec);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{ \"nombre\": \""+nombre+"\", \"precio\": "+ precio +", " +categoria +" }"+ System.getProperty("line.separator");
    }
    
}
