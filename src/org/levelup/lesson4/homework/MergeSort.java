package org.levelup.lesson4.homework;

import org.levelup.lesson2.Array;

public class MergeSort {
    int[] array;

    int[] sort(int[]array) {

        if (array.length <=1) {
        return array;
    }

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        System.arraycopy(array, 0, left, 0, leftSize);
        System.arraycopy(array, leftSize, right,0, rightSize);
        sort(left);
        sort(right);
        merge(array, left, right);
    return array;
    }

    public void merge(int[] array, int[] left, int[] right) {

        int leftIndex = 0;
        int rightIndex = 0;
        int targetIndex = 0;
        int remaining = left.length + right.length;

        while(remaining > 0)
        {
            if (leftIndex >= left.length)
            {
                array[targetIndex] = right[rightIndex++];
            }
            else if (rightIndex >= right.length)
            {
                array[targetIndex] = left[leftIndex++];
            }
            else if (left[leftIndex]<(right[rightIndex]))
            {
                array[targetIndex] = left[leftIndex++];
            }
            else
            {
                array[targetIndex] = right[rightIndex++];
            }

            targetIndex++;
            remaining--;
        }
    }
}
