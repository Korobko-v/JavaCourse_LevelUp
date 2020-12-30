package org.levelup.lesson4;

public class CastExample {
    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle recObjFromSquare = square;
        Shape shapeObjFromSquare = recObjFromSquare;
        Object objFromSquare = square;
        Rectangle rectangle = new Rectangle(4,5);
        Rectangle rec = new Rectangle(5,4);
        Shape shape = new Shape(new int[]{4, 6, 8, 8, 9});
        Shape[] shapes = new Shape[] {shape, rec, rectangle, square};
        ShapeService ss = new ShapeService();
        ss.printShapePerimeters(shapes);


        System.out.println("Сторона квадрата: " + square.getSide());
    }
}
