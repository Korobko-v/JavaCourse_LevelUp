package org.levelup.lesson2.homework2;

import java.util.Scanner;

public class CloseToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        System.out.print("Введите число m: ");
        int m = sc.nextInt();
        System.out.println((Math.abs(10-n) < Math.abs(10-m)) ? n : m);
    }
}
