package org.levelup.lesson5;

public class SortApp {
    public static void main(String[] args) {

        int[]array = new int[] {1, 2, 3, 4, 5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        MergeSort mergeSort = new MergeSort();
        NumberArraySort arraySort = mergeSort;
        arraySort.sort(array);

        sortAndPrintArray(array,arraySort);
        sortAndPrintArray(array, bubbleSort);
        sortAndPrintArray(array, mergeSort);

        NumberArraySort ms = getSort("merge");
        

    }
    static void sortAndPrintArray(int[] array, NumberArraySort arraySort) {
        arraySort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    static NumberArraySort getSort (String sortType) {
        if (sortType.equals("merge")) {
            return new MergeSort();
        }
        return new BubbleSort();
    }
}
