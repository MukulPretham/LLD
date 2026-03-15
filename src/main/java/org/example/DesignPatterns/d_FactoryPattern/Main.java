package org.example.DesignPatterns.d_FactoryPattern;

// Factory pattern is used when we wanna create a object (instance) based on the condition.

import org.example.DesignPatterns.d_FactoryPattern.Factories.ShapeFactory;
import org.example.DesignPatterns.d_FactoryPattern.Shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();
    }
}
