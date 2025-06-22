package org.example;

public class App {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3),
            new Rectangle(4, 5),
            new RightTriangle(3, 4),
            new Square(4),
            new IsoscelesRightTriangle(5)
        };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            if (shape instanceof Polygon) {
                System.out.println("Number of sides: " + ((Polygon) shape).numberOfSides());
            }
            System.out.println();
        }
    }
}