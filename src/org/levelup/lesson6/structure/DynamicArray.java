package org.levelup.lesson6.structure;

import java.util.List;

public class DynamicArray extends Structure {
    private int[] elementData;

    public DynamicArray(int initialCapacity) {
        elementData = new int[initialCapacity];

    }

    @Override
    public void addLast(int value) {
        if (elementData.length == size) {
            int[]oldArray = elementData;
            elementData = new int[(int)(size * 1.5)];
            System.arraycopy(oldArray, 0, elementData, 0, oldArray.length);
        }
        elementData[size++] = value;
    }

    @Override
    public void removeByIndex(int index) {
        int[] newArr = new int[elementData.length-1];
        int i = 0;
        for (int j = 0; j < elementData.length; j++) {
            if (j != index) {
                newArr[i++] = elementData[j];
            }
        }
        size--;
        elementData = newArr;
//        for (int k = 0; k < size; k++) {
//            System.out.println(newArr[k]);
//        }

    }
    @Override
    public void removeByValue(int value) {
        int len = elementData.length;
        for (int i : elementData) {
            if (i == value) {
                len--;
                size--;
            }
        }
        int newLength = 0;
        int[] arr = new int[len];
        for (int j : elementData) {
            if (j != value) {
                arr[newLength++] = j;
            }
        }
        elementData = arr;
//        for (int k = 0; k < size; k++) {
//            System.out.println(elementData[k]);
//        }
    }

    @Override
    public int getByIndex(int index) {
        return elementData[index];
    }

    public void trim() {
        int[] array = new int[size];
        System.arraycopy(elementData, 0, array, 0, size);
        elementData = array;
    }
}
