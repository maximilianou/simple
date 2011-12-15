package simple.crearjavaprogramador.entities;
//maximilianou@gmail.com

import simple.crearjavaprogramador.render.RenderJSON;
import simple.crearjavaprogramador.validation.BelowZeroException;
import simple.crearjavaprogramador.validation.Validator;


public abstract class Product implements RenderJSON {
    private String name;
    private String description;
    private double amount;
    public void print(){
        System.out.println("Product: ["+getName()+"], $ ["+getAmount()+"] : ["+ getDescription()+"]");
    }
    public String toString(){
        return ""+ getName()+", $ "+getAmount();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws BelowZeroException {
        Validator.positive(amount);
        this.amount = amount;
    }
    
}
