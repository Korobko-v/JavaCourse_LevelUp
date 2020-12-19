package org.levelup.lesson2.homework2;

import java.util.Random;

public class Intervals {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(151) + 5;
        System.out.println((a > 25 && a < 100) ? "Число " + a + " содержится в интервале (25,100)" :
                "Число " + a + " не содержится в интервале (25,100)");
    }
}
