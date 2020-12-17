package org.levelup.lesson2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //Считывание данных с клавиатуры
        Scanner sc = new Scanner(System.in);
        //Считываем число с клавиатуры
//        System.out.println("Введите число:");
        int number ;

        //Генерация псведослучайных чисел
        Random r = new Random();
        int secretNumber = r.nextInt(4);

//        if (number == secretNumber) {
//            System.out.println("Вы угадали");
//        }
//        else {
//            System.out.println("Вы не угадали. Секретное число: " + secretNumber);
//            if (number > secretNumber) {
//                System.out.println("Многовато");
//                System.out.println(secretNumber);
//            }
//            else {
//                System.out.println("Маловато");
//                System.out.println(secretNumber);
//            }
//        }
//        while (number!=secretNumber) {
//            System.out.println("Вы не угадали");
//            System.out.println("Введите число заново:");
//            number = sc.nextInt();
//        }
        do {
            System.out.println("Введите число:");
            number = sc.nextInt();
        }
        while (number!=secretNumber);
        System.out.println("Ура");
    }
}
