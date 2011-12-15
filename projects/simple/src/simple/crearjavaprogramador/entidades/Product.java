package simple.crearjavaprogramador.entidades;
//maximilianou@gmail.com

import simple.crearjavaprogramador.validation.BelowZeroException;
import simple.crearjavaprogramador.validation.Validator;


public class Product {
    private String name;
    private String description;
    private double amount;
    public void print(){
        System.out.println("Product: ["+getName()+"], $ ["+getAmount()+"] : ["+ getDescription()+"]");
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
