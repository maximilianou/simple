package abc.clases02;
/**
 * @author maximilianou
 */
public class Aviso {

    private String titulo;
    private String descripcion;
    private float precio;

    public Aviso(String titulo, float precio){
        this.setPrecio(precio);
        this.setTitulo(titulo);
    }
    public Aviso(String titulo, float precio, String descripcion){
        this.setPrecio(precio);
        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
