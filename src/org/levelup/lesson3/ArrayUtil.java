package org.levelup.lesson3;

public class ArrayUtil {
    int[]array;

    int min(int[]array) {
        int min = Integer.MAX_VALUE;
        for (int a : array) {
            min = Math.min(min , a);
        }
        return min;
    }

    int max(int[]array) {
        int max = Integer.MIN_VALUE;
        for (int a : array) {
            max = Math.max(max , a);
        }
        return max;
    }
}
