package abc.clases05;
import java.util.*;
/** @author maximilianou 
 Diccionario de Avisos por Categoria, Singleton(Unica Instancia de Admin)*/
public class AdministradorAvisos {
    private static AdministradorAvisos INSTANCE = new AdministradorAvisos();
    public static AdministradorAvisos getInstance(){
        return INSTANCE;
    }
    private TreeMap<String, ArrayList<Aviso>> avisos = new TreeMap();
    public void addByCategory(Aviso aviso_param){
        ArrayList<Aviso> contenidoCategoria = avisos.get(aviso_param.getCategoria().getNombre());
        if( contenidoCategoria == null ){
            contenidoCategoria = new ArrayList();
            avisos.put(aviso_param.getCategoria().getNombre(), contenidoCategoria);
        }
        contenidoCategoria.add(aviso_param);
    }
    public Iterator getCategoryNames(){
        return avisos.keySet().iterator();
    }
    public ArrayList getAvisosByCategory(String cateName){
        return avisos.get(cateName);
    }
}
