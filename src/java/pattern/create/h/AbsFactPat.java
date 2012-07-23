package pattern.create.h;
public class AbsFactPat {
    public static void main(String[] args) {
        System.out.println("-------- AbstractFactory con Facade ------");
        Producto p = ProductFacade.getProducto("12");
        Producto p1 = ProductFacade.getProducto("22");
        Producto p2 = ProductFacade.getProducto("31");
        Producto p3 = ProductFacade.getProducto("8549");
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("-------- AbstractFactory con Facade ------");
    }
}
abstract class Producto{
    private String id;
    public void setId(String pid){
        id = pid;
    }
    public String getId(){
        return id;
    }
}
class Servicio extends Producto{
    public String toString(){ return "Servicio:["+getId()+"]"; }
}
class Articulo extends Producto{
    public String toString(){ return "Articulo:["+getId()+"]"; }
}
abstract class ProductFactory{
    public abstract Producto getProducto(String id);
}
class ServiceFactory extends ProductFactory{
    @Override
    public Producto getProducto(String id) {
        Servicio s = new Servicio();
        s.setId(id);
        return s;
    }
}
class ArticuloFactory extends ProductFactory{
    @Override
    public Producto getProducto(String id) {
        Articulo a = new Articulo();
        a.setId(id);
        return a;
    }
}
abstract class ProductFacade{
    static ProductFactory unaFact = new ServiceFactory();
    static ProductFactory otraFact = new ArticuloFactory();
    public static Producto getProducto(String id){
        Producto p;
        if(id.length() > 3){
            p = otraFact.getProducto(id);
        }else{
            p = unaFact.getProducto(id);
        }
        return p;
    }
}

