package pattern.structure.d;

public class DecoratorTest {
    public static void main(String[]args){
        Coffee c = new SimpleCoffee();
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
        c = new Milk(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
        c = new Sprinkles(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
        c = new Whip(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
        c = new Sprinkles(c);
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }
}
interface Coffee{
    public double getCost();
    public String getIngredients();
} 
class SimpleCoffee implements Coffee{
    @Override public double getCost() {
        return 1;
    }
    @Override public String getIngredients() {
        return "Coffee";
    }
}
abstract class CoffeeDecorator implements Coffee {
    protected final Coffee decoratedCoffee;
    protected String ingredientSeparator = ", ";
    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    @Override public double getCost() { // implementing methods of the interface
        return decoratedCoffee.getCost();
    }
    @Override public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}
class Milk extends CoffeeDecorator {
    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override public double getCost() { // overriding methods defined in the abstract superclass
        return super.getCost() + 0.5;
    }
    @Override public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Milk";
    }
}
class Whip extends CoffeeDecorator {
    public Whip(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override public double getCost() {
        return super.getCost() + 0.7;
    }
    @Override public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Whip";
    }
}
class Sprinkles extends CoffeeDecorator {
    public Sprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override public double getCost() {
        return super.getCost() + 0.2;
    }
    @Override public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Sprinkles";
    }
}

