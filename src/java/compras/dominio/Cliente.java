package compras.dominio;

public class Cliente {
    private String nombre;
    private Carrito carrito;
    public Cliente(String nom){
        setNombre(nom);
        carrito = new Carrito();
    }
    public Carrito getCarrito() {
        return carrito;
    }
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
