package org.levelup.lesson1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FromHexadecimal {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("1" , 1);
        map.put("2" , 2);
        map.put("3" , 3);
        map.put("4" , 4);
        map.put("5" , 5);
        map.put("6" , 6);
        map.put("7" , 7);
        map.put("8" , 8);
        map.put("9" , 9);
        map.put("A" , 10);
        map.put("B" , 11);
        map.put("C" , 12);
        map.put("D" , 13);
        map.put("E" , 14);
        map.put("F" , 15);
        System.out.println("Введите число в шестнадцатеричной системе:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String hex = reader.readLine();
            int result = 0;
            int length = hex.length();
            for (int i = 0; i < length; i++) {
                result+=map.get(hex.charAt(i)+"") * Math.pow(16,(length-1-i));
            }
            System.out.println("Число в десятичной системе: " + result);
        } catch (NullPointerException e) {
            System.out.println("Ты лжец");
        }
    }
}
