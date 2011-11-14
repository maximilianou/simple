package simple.crearjavaprogramador.entidades;
//maximilianou@gmail.com

public class Product {
    public String name;
    public String description;
    public double amount;
    public void print(){
        System.out.println("Product: ["+name+"], $ ["+amount+"] : ["+ description+"]");
    }
}
