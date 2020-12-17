package org.levelup.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToBinary {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число в десятичной системе:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int decimalToConvert = Integer.parseInt(br.readLine());
        String finalStr = "";
        while (decimalToConvert > 0) {
            finalStr = String.valueOf(decimalToConvert % 2) + finalStr;
            decimalToConvert = decimalToConvert / 2;
        }
        System.out.println("Число в двоичной системе: " + finalStr);
    }
}
