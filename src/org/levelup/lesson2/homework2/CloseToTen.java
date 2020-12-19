package org.levelup.lesson2.homework2;

import java.util.Scanner;

public class CloseToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        if (n <=0) {
            while (n <=0) {
                System.out.print("Введите положительное число: ");
                n = sc.nextInt();
            }
        }
        System.out.print("Введите число m: ");
        int m = sc.nextInt();
        if (m <=0) {
            while (m <=0) {
                System.out.print("Введите положительное число: ");
                m = sc.nextInt();
            }
        }
        System.out.println((Math.abs(10-n) < Math.abs(10-m)) ?
                "Ближаейшее к 10 число: " + n : "Ближаейшее к 10 число: " + m);
    }
}
