package pattern.create.c;
import java.util.*;
public class ObjectPool {
    public static void main(String[]args){
        System.out.println("------------- Object Pool --------------");
        Pool<String> ps = new Pool<String>(); 
        Recurso<String> s = ps.getE();
        Recurso<String> s2 = ps.getE();
        Recurso<String> s3 = ps.getE();
        System.out.println(":"+s);
        System.out.println(":"+s2);
        System.out.println(":"+s3);
        System.out.println("------------- Object Pool --------------");
        ps.release(s);
        Recurso<String> s4 = ps.getE();
        System.out.println(":"+s2);
        System.out.println(":"+s3);
        System.out.println(":"+s4);
        ps.release(s2);
        ps.release(s3);
        ps.release(s4);
        System.out.println("------------- Object Pool --------------");
        Recurso<String> s5 = ps.getE();
        Recurso<String> s6 = ps.getE();
        Recurso<String> s7 = ps.getE();
        System.out.println(":"+s5);
        System.out.println(":"+s6);
        System.out.println(":"+s7);
        ps.release(s5);
        ps.release(s6);
        ps.release(s7);
        System.out.println("------------- Object Pool --------------");
    }
}

class Pool<E>{
    private ArrayList<Recurso> recursos = new ArrayList<Recurso>();
    public Recurso<E> getE(){
        Recurso<E> e = null;
        for(int i = 0; i < recursos.size() && e == null; i++){
            if(recursos.get(i).isLibre()){
                e = recursos.get(i);
            }
        }
        if(e==null){
            e  = new Recurso<E>();
            //TODO: Inicializar E !!!
            recursos.add(e);
        }
        e.setLibre(false);
        return e;
    }
    public void release(Recurso r){
        r.setLibre(true);
    }
}
class Recurso<E>{
    private E obj;
    private boolean libre = true;
    public Recurso(){
    }
    public E getObj() {
        return obj;
    }
    public void setObj(E obj) {
        this.obj = obj;
    }
    public boolean isLibre() {
        return libre;
    }
    public void setLibre(boolean libre) {
        this.libre = libre;
    }
}