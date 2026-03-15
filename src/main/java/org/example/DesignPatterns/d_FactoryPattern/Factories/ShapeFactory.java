package org.example.DesignPatterns.d_FactoryPattern.Factories;

import org.example.DesignPatterns.d_FactoryPattern.Shapes.Circle;
import org.example.DesignPatterns.d_FactoryPattern.Shapes.Shape;
import org.example.DesignPatterns.d_FactoryPattern.Shapes.Square;

public class ShapeFactory {
    public Shape getShape(String shape) {
        switch (shape) {
            case "CIRCLE" -> {
                return new Circle();
            }
            case "SQUARE" -> {
                return new Square();
            }
        }
        return null;
    }
}
