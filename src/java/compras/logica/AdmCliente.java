

package compras.logica;

import compras.dominio.Categoria;
import compras.dominio.Cliente;
import java.util.ArrayList;
import java.util.List;


public class AdmCliente {
    private static List<Cliente> clientes;
    public static List<Cliente> getClientes() {
        if(clientes == null){
            cargarClientes();
        }
        return clientes;
    }
    /** 
     * Obtiene las Categorias desde su fuente de datos ( Archivo | SQL | JSON )
     */
    public static void cargarClientes(){
        if( clientes == null){
            clientes = new ArrayList<Cliente>();
        }else{
            clientes.clear();
        }
        clientes.add(new Cliente("Cecilia"));
        clientes.add(new Cliente("Paula"));
        clientes.add(new Cliente("Elizabeth"));
    }
}
