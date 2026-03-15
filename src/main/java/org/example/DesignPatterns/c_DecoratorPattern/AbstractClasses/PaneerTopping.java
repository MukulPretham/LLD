package org.example.DesignPatterns.c_DecoratorPattern.AbstractClasses;

public class PaneerTopping extends Topping {
    BasePizza basePizza;

    public PaneerTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
