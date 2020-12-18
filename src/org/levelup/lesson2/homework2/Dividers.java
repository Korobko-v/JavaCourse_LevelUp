package org.levelup.lesson2.homework2;

import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое положительное число: ");
            int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Неверное число");
        }
        else {
            int count = 0;
            System.out.println("Натуральные делители числа " + n + ":");
            for (int i = 2; i <= (int)Math.sqrt(n); i++) {
                if (n%i==0) {
                    count ++;
                    System.out.println(i);
                }
            }
            if (count==0) {
                System.out.println("отсутствуют. " + n + " - простое число.");
            }
        }
    }
}
