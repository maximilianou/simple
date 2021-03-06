package abc.clases05;

/**
 *
 * @author maximilianou
 */
public class Aviso {
    
    private String titulo;
    private String descripcion;
    private float precio;

    private Categoria categoria; 
    
    public Aviso(String titulo, float precio, Categoria categ) throws Exception{
        this.setPrecio(precio);
        this.setTitulo(titulo);
        this.setCategoria(categ);
    }
    public Aviso(String titulo, float precio, Categoria categ, String descripcion) throws Exception{
        this(titulo, precio, categ);
        this.setDescripcion(descripcion);
    }
    
    @Override
    public String toString() {
        return "Aviso(Titulo:"+this.titulo+"; Precio:"+this.precio+"; Descripcion:"+this.descripcion+")";
    }
    
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) throws Exception {
        if( titulo == null || titulo.length() < 1 ){
            throw new Exception("Un Aviso debe tener un Titulo al menos un caracter.");
        }
        this.titulo = titulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) throws Exception {
        if( precio < 0 ){
            throw new Exception("Un aviso debe tener un precio positivo.");
        }
        this.precio = precio;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }



    
}
