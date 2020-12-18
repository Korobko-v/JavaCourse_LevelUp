package org.levelup.lesson2.homework2;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String isEven = (n%2==0) ? "Число " + n + " - чётное" : "Число " + n + " - нечётное" ;
        System.out.println(isEven);
    }
}
