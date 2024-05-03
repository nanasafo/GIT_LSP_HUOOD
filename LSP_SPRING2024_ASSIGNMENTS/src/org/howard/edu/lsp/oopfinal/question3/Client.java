package org.howard.edu.lsp.oopfinal.question3;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.createShape("RECTANGLE");
        rectangle.draw();
    }
}