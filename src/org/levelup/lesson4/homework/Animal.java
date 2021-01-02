package org.levelup.lesson4.homework;


public class Animal {

    String location;
    String food;

    public Animal() {
    }

    public Animal (String location, String food) {
        this.location = location;
        this.food = food;
    }

    void makeNoise() {
        System.out.println("Животное орёт");
    }

    void eat() {
        System.out.println("Животное ест");
    }

    void sleep() {
        System.out.println("Животное спит");
    }


    public static void main(String[] args) {

        Dog dog = new Dog("Конура" , "Мясо", "Корги");
        dog.makeNoise();
        dog.eat();
        dog.sleep();

        Horse horse = new Horse("Конюшня", "Овёс", "Чёрный");
        horse.eat();
        horse.sleep();

        Cat cat = new Cat("Кровать", "Корм", true);
        cat.eat();
        cat.sleep();
    }
}
