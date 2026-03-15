package org.example.DesignPatterns.c_DecoratorPattern.AbstractClasses;

public class CheeseTopping extends Topping{
    BasePizza basePizza;
    public CheeseTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
