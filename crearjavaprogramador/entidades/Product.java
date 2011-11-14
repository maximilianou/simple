package simple.crearjavaprogramador.entidades;

public class Product {
    public String name;
    public String description;
    public double amount;
    public void print(){
        System.out.println("Product: ["+name+"], $ ["+amount+"] : ["+ description+"]");
    }
}
