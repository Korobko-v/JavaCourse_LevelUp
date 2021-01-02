package org.levelup.lesson4.homework;

public class ArraySortingApp {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = new int[] { 2, 4, 1, 0, -18, 20, 12};
        ms.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
