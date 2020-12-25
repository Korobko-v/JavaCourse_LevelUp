package org.levelup.lesson3;

public class ArraySorting {
    int[] array;

    ArraySorting(int[]array) {
        this.array = array;
    }

    int[] bubbleSort(int[] array) {
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
