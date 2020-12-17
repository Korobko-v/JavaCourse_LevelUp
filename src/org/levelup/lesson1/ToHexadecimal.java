package org.levelup.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeMap;

public class ToHexadecimal {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1 , "1");
        map.put(2 , "2");
        map.put(3 , "3");
        map.put(4 , "4");
        map.put(5 , "5");
        map.put(6 , "6");
        map.put(7 , "7");
        map.put(8 , "8");
        map.put(9 , "9");
        map.put(10 , "A");
        map.put(11 , "B");
        map.put(12 , "C");
        map.put(13 , "D");
        map.put(14 , "E");
        map.put(15 , "F");
        System.out.println("Введите число в десятичной системе:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int decimalToConvert = Integer.parseInt(br.readLine());
        String finalStr = "";
        while (decimalToConvert > 0) {
            finalStr = map.get(decimalToConvert % 16) + finalStr;
            decimalToConvert = decimalToConvert / 16;
        }
        System.out.println("Число в шестнадцатеричной системе: " + finalStr);
    }
}
