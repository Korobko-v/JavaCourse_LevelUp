package org.levelup.lesson6.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StructureApp {
    public static void main(String[] args) {
//        AbstractStructure structure = new DynamicArray(5);
//        structure.addLast(5);
//        structure.addLast(2);
//        structure.addLast(3);
//        structure.addLast(4);
//        structure.addLast(1);
//        structure.addLast(75);
//        structure.addLast(17);
//        structure.addLast(72);
//        structure.removeByValue(3);
//        structure.removeByIndex(1);
//        System.out.println(structure.size);
//        structure.trim();
//        System.out.println(structure.getByIndex(5));

       Structure<String> list = new OneWayList<>();
       list.add("a");
       list.add("b");
       list.add("c");
        list.add("e");
        list.add("f");
//        System.out.println(list.contains("c"));
//        list.removeByValue("c");
//        System.out.println(list.contains("c"));
//        list.add("kek");
//        System.out.println(list.contains("kek"));
//        list.removeByValue("kek");
//        System.out.println(list.contains("kek"));


        Random r = new Random();
        List <Integer> oldList = new ArrayList<>();
        System.out.println("Old: ");
        for (int i = 0; i < r.nextInt(10) + 10; i++) {
            oldList.add(r.nextInt(100) - 50);
            System.out.println(oldList.get(i));
        }

        List <Integer> newList = new ArrayList<>();
        System.out.println("New: ");
        for (int j = 0; j < 10; j++) {
            newList.add(oldList.get(j));
            System.out.println(newList.get(j));
        }
        List <Integer> unique = new ArrayList<>();
        for (int i : newList) {
            int count = 0;
            for (int k : newList) {
                if (k == i) {
                    count++;
            }
            }
            if (count == 1) {
                unique.add(i);
            }
        }
        System.out.println("Unique");
        for (int k : unique) {
            System.out.println(k);
        }

        Collections.sort(unique);
        System.out.println("Sorted unique: ");
        for (int k : unique) {
            System.out.println(k);
        }

        Collections.reverse(unique);
        System.out.println("Reversed unique: ");
        for (int k : unique) {
            System.out.println(k);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int k : unique) {
            if (max < k) {
                max = k;
            }
            if (min > k) {
                min = k;
            }
            sum += k;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);

        List<Integer> oldPositive = new ArrayList<>();
        System.out.println("OldPositive: ");
        for (int i : oldList) {
            if (i > 0) {
                oldPositive.add(i);
                System.out.println(i);
            }
        }
            int removeIndex = 0;
        for (int i = 0; i < oldPositive.size(); i++) {
            if (oldPositive.get(i) % 2 != 0) {
                oldPositive.remove(i);
                i--;
            }
        }
        System.out.println("Even oldPositive: ");
        for (int i : oldPositive) {
            System.out.println(i);
        }

        List<Integer> theLast = new ArrayList<>();
        theLast.add(0);
        theLast.add(1);
        theLast.add(2);
        theLast.add(3);
        theLast.add(4);
        System.out.println("The index of 2 is: " + theLast.indexOf(2));
    }
}
