package org.levelup.lesson2.homework2;

public class Sequences {
    public static void main(String[] args) {
//        Создайте программу, выводящую на экран все четырёхзначные
//        числа последовательности 1000 1003 1006 1009 1012 1015 ...

        for (int i = 1000; i <=9999; i+=3) {
            System.out.println(i);
        }

        //Создайте программу, выводящую на экран первые
        // 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …

        int a = -1;
        for (int i = 0; i < 55; i++) {
            System.out.println(a+=2);
        }

        //Создайте программу, выводящую на экран
        // все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

        for (int i = 90; i >=0; i-=5) {
            System.out.println(i);
        }

        //Создайте программу, выводящую на экран первые 20 элементов
        // последовательности 2 4 8 16 32 64 128 ….

        for (int i = 1; i <=20; i++) {
            System.out.println((int)Math.pow(2,i));
        }

    }
}