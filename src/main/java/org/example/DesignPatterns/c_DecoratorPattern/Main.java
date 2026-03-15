package org.example.DesignPatterns.c_DecoratorPattern;

// PROBLEM
// Suppose There is a class which is a base class having some features, now if we wanna add a separate
// class defining new features. In this situations we create class and extends the base classes adding new
// Features. This makes difficult to manage the classes.

//class Pizza {
//    int cost;
//    Pizza(int cost){
//        this.cost = cost;
//    }
//}
//
//class PizzaWithExtraCheese extends Pizza {
//    int cost;
//    PizzaWithExtraCheese(int cost) {
//        super(cost);
//        this.cost = cost;
//    }
//}

import org.example.DesignPatterns.c_DecoratorPattern.AbstractClasses.*;

public class Main {
    public static void main(String[] args) {
        BasePizza vegPizza = new VegPizza();
        Topping cheeseTopped = new CheeseTopping(vegPizza);
        Topping paneerTopping = new PaneerTopping(cheeseTopped);
        System.out.println(((PaneerTopping) paneerTopping).cost());
    }
}
