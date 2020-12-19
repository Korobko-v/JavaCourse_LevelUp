package org.levelup.lesson2.homework2;

import java.util.Random;

public class TheGreatestNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(900) + 100;
        String[]strDigits = String.valueOf(a).split("");
        int maxDigit = 0;
        for (int i = 0; i < strDigits.length; i++) {
            maxDigit = Math.max(Integer.parseInt(strDigits[i]), maxDigit);
        }

        System.out.println("В числе " + a + " наибольшая цифра: " + maxDigit);
    }
}
