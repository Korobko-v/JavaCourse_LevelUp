package org.levelup.lesson4.homework;

public class ArraySortingApp {
    public static void main(String[] args) {

        Sorting sorting = new Sorting();
        int[] evenArr = new int[] { 2, 4, 1, 0, -18, 12};
        int[] oddArr = new int[] { 2, 4, 1, 0, -18, 20, 12};
        int[] longArr = new int[] { 2, 4, 1, 0, -18, 20, 12, 8, 5, 3, 33, 34, 54, 233, 54, 34, 77, 88, 23, 25, 35, 90 };
        sorting.sort(evenArr);
        for (int i : evenArr) {
            System.out.println(i);
        }
        sorting.sort(oddArr);
        for (int j : oddArr) {
            System.out.println(j);
        }
        sorting.sort(longArr);
        for (int k : longArr) {
            System.out.println(k);
        }
    }
}
