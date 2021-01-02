package org.levelup.lesson4.homework;

public class Horse extends Animal  {
    String location;
    String food;
    String color;

    public Horse(String location, String food, String color) {
        super(location, food);
        this.color = color;
    }


    @Override
    void makeNoise() {
        System.out.println("Игого");
    }

    @Override
    void eat() {
        System.out.println(color + " конь ест");
    }

    @Override
    void sleep() {
        System.out.println(color + " конь спит");
    }
}
