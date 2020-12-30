package org.levelup.lesson4;

public class ShapesApp {
    public static void main(String[] args) {
        //Shape unknownShape = new Shape();
        Rectangle rectangle = new Rectangle(3, 6);
        for (int i = 0; i < rectangle.sides.length; i++) {
            System.out.println(rectangle.sides[i]);
        }
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Периметр прямоугольника: " + perimeter);
        Square square = new Square(5);
       System.out.println("Периметр квадрата: " + square.calculatePerimeter());

    }

}
