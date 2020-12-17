package org.levelup.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToDecimal {
    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в двоичной системе:");
        String strBinary = reader.readLine();
        int decimal = 0;

        if (strBinary.matches("[01]*[2-9]")) {
            System.out.println("Ты чо ввёл, дурак?");
        } else {
            int a = strBinary.length() - 1;
            int j = 1;
            for (int i = 0; i <= a; i++) {
                decimal += (Integer.parseInt(strBinary.charAt(a - i) + "") * j);
                j *= 2;
            }
        }
        System.out.println("Число в десятичной системе: " + decimal);
    }
}