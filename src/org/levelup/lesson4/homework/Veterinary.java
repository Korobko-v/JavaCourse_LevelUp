package org.levelup.lesson4.homework;

import java.util.List;

public class Veterinary {

    public static void main(String[] args) {
        Veterinary doc = new Veterinary();
        Animal[] animals = new Animal[3];
        Dog dog = new Dog("квартира", "мясо", "чихуахуа");
        Cat cat = new Cat("квартира" , "корм" , true);
        Horse horse = new Horse("конюшня" , "овёс", "белый");

        animals[0] = dog;
        animals[1] = cat;
        animals[2] = horse;
        for (Animal animal: animals) {
            doc.treatAnimal(animal);
        }
    }

    void treatAnimal(Animal animal) {
        System.out.println("Еда: " + animal.food + ". Место жительства: " + animal.location + ".");
    }
}
