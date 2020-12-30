package org.levelup.lesson4;

public class Shape {
    int[] sides;

    public Shape() {
        System.out.println("Вызван конструктор Shape");
        this.sides = new int[0];
    }
    public  Shape(int[]sides) {
        System.out.println("Вызван конструктор Shape" +
                " с параметром int[] sides");
        this.sides = sides;
    }
    public double calculatePerimeter() {
        double sum = 0;
        for (int i = 0; i < sides.length; i++) {
            sum += sides[i];
        }
        return sum;
    }
}
