package org.levelup.lesson4.homework;

public class Dog extends Animal {
    String location;
    String food;
    String breed;

    public Dog(String location, String food, String breed) {
        super(location, food);
        this.breed = breed;
    }

    @Override
    void makeNoise() {
        System.out.println("Гав-гав");
    }

    @Override
    void eat() {
        System.out.println(breed + " ест");
    }

    @Override
    void sleep() {
        System.out.println(breed + " спит");
    }
}
