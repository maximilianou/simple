/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.clases05;

/**
 *
 * @author maximilianou
 */
public class Categoria {

    private String nombre;

    public Categoria(String nom) {
        setNombre(nom);
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
