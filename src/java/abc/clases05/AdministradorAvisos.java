/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.clases05;

import java.util.*;

/**
 *
 * @author maximilianou
 */
public class AdministradorAvisos {
    private static AdministradorAvisos INSTANCE = new AdministradorAvisos();
    public static AdministradorAvisos getInstance(){
        return INSTANCE;
    }
    private TreeMap<Categoria, ArrayList<Aviso>> avisos = new TreeMap();
    public void addProducto(){
    }
    
}
