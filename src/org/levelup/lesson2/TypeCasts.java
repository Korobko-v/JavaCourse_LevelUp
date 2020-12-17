package org.levelup.lesson2;

public class TypeCasts {
    public static void main(String[] args) {
        int intVar = 493;
        long longVar = intVar;
        System.out.println(longVar);
        short shortVar = (short)longVar;
        System.out.println(shortVar);
        int value = 130;
        byte byteVar = (byte) value;
        System.out.println(byteVar);
        int v = 128 >>> 3;
        System.out.println(v);
        int v1 = 30&4;
        System.out.println(v1);
    }
}
