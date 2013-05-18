package abc.clases03;
/**
 * @author maximilianou
 */
public class Aviso {
    private String titulo;
    private String descripcion;
    private float precio;

    public Aviso(String titulo, float precio) throws Exception{
        this.setPrecio(precio);
        this.setTitulo(titulo);
    }
    public Aviso(String titulo, float precio, String descripcion) throws Exception{
        this.setPrecio(precio);
        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) throws Exception {
        if( titulo == null || titulo.length() < 1 ){
            throw new Exception("Un Aviso debe tener un Titulo al menos un caracter.");
        }
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
    public void setPrecio(float precio) throws Exception {
        if( precio < 0 ){
            throw new Exception("Un aviso debe tener un precio positivo.");
        }
        this.precio = precio;
    }

}
