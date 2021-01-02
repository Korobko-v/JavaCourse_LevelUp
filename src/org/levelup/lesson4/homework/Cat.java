package org.levelup.lesson4.homework;

public class Cat extends Animal {

    String location;
    String food;
    boolean theTreeIsFallen;

    public Cat(String location, String food, boolean theTreeIsFallen) {
        super(location, food);
        this.theTreeIsFallen = theTreeIsFallen;
    }

    @Override
    void makeNoise() {
        System.out.println("Мяу");
    }

    @Override
    void eat() {
        System.out.println("Кот ест");
    }
    void dropTheTree() {
        theTreeIsFallen = true;
        System.out.println("Кот уронил ёлку");
    }

    @Override
    void sleep() {
        System.out.println((theTreeIsFallen) ? "Кот уронил ёлку и спит" : "Кот спит");
    }
}
