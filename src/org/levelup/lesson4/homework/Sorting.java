package org.levelup.lesson4.homework;

// Массивы с чётной длиной сортирует слиянием, массивы с нечётной - пузырьком

public class Sorting {
    public int[] sort (int[] array) {

        if (array.length % 2 == 0) {
           MergeSort ms = new MergeSort();
           ms.sort(array);
           System.out.println("Merge sorting");
        }
        else  {
           BubbleSorting bs = new BubbleSorting();
           bs.sort(array);
           System.out.println("Bubble sorting");
        }
       return array;
    }
}
