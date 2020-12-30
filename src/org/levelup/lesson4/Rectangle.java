package org.levelup.lesson4;

public class Rectangle extends Shape {
    public Rectangle() {
        super(); //Вызов конструктора родительского класса
        System.out.println("Вызван конструктор Rectangle");
    }
    public Rectangle(int width, int length) {
        super(new int[] {width, length, width, length});

    }
    public double calculatePerimeter() {
        return (sides[0]*2 + sides[1]*2);
    }
}
