package org.levelup.lesson4.homework;

public class BubbleSorting extends Sorting {
    int[] array;

    @Override
    public int[] sort(int[] array) {
        for (int out = array.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    int t = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = t;
                }
            }
        }
        return array;
    }
}

