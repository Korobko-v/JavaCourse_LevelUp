package org.levelup.lesson2.homework2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите любое натуральное число n: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n < 0) {
            System.out.println("Неверное число");
        }
        else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial*=i;
            }
            System.out.println("n! = " + factorial);
        }
        reader.close();
    }
}
