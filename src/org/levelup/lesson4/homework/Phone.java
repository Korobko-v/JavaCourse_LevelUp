package org.levelup.lesson4.homework;

public class Phone {
    String number;
    String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this (number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void main(String[] args) {
        Phone honor9x = new Phone("+78005553535", "Honor 9X" , 225);
        Phone iPhoneX = new Phone("+79815551010", "IPhone X" , 268);
        Phone xiaomiRedmiNote2 = new Phone("911", "Xiaomi Redmi Note 2" , 241);

        honor9x.printPhone();
        iPhoneX.printPhone();
        xiaomiRedmiNote2.printPhone();

        honor9x.receiveCall("Игорь");
        System.out.println(honor9x.getNumber());

        iPhoneX.receiveCall("Олег");
        System.out.println(iPhoneX.getNumber());

        xiaomiRedmiNote2.receiveCall("Гжегож");
        System.out.println(xiaomiRedmiNote2.getNumber());

        honor9x.receiveCall("Вольдемар" , "03");

        honor9x.sendMessages("\"Добрейший вечерочек\"" , new String[] {iPhoneX.getNumber(),
                xiaomiRedmiNote2.getNumber()});

    }
    void printPhone() {

        System.out.println("Number: " + number + "; Model: " + model + "; Weight: " + weight + ".");
    }

    void receiveCall(String name) {

        System.out.println("Звонит " + name);
    }
    void receiveCall(String name, String number) {

        System.out.println("Звонит " + name + " (" + number + ").");
    }

    String getNumber() {
        return number;
    }

    void sendMessages (String text, String[] arr) {
        System.out.println(text);
        System.out.println("Получатели:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
