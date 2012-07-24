package pattern.create.f;
public class Builder {  /** A customer ordering a pizza. */
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder( hawaiian_pizzabuilder );
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
    }
}    
 class Pizza {  /** "Product" */
    private String dough = "";
    private String sauce = "";
    private String topping = "";
    public void setDough(String dough)     { this.dough = dough; }
    public void setSauce(String sauce)     { this.sauce = sauce; }
    public void setTopping(String topping) { this.topping = topping; }
 }
 abstract class PizzaBuilder { /** "Abstract Builder" */
    protected Pizza pizza;
    public Pizza getPizza() { return pizza; }
    public void createNewPizzaProduct() { pizza = new Pizza(); }
    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
 }
 class HawaiianPizzaBuilder extends PizzaBuilder { /** "ConcreteBuilder" */
    public void buildDough()   { pizza.setDough("cross"); }
    public void buildSauce()   { pizza.setSauce("mild"); }
    public void buildTopping() { pizza.setTopping("ham+pineapple"); }
 }
 class SpicyPizzaBuilder extends PizzaBuilder {  /** "ConcreteBuilder" */
    public void buildDough()   { pizza.setDough("pan baked"); }
    public void buildSauce()   { pizza.setSauce("hot"); }
    public void buildTopping() { pizza.setTopping("pepperoni+salami"); }
 }
 class Waiter {  /** "Director" */
    private PizzaBuilder pizzaBuilder;
    public void setPizzaBuilder(PizzaBuilder pb) { pizzaBuilder = pb; }
    public Pizza getPizza() { return pizzaBuilder.getPizza(); }
    public void constructPizza() {
       pizzaBuilder.createNewPizzaProduct();
       pizzaBuilder.buildDough();
       pizzaBuilder.buildSauce();
       pizzaBuilder.buildTopping();
    }
 }