package org.levelup.lesson10;

import org.levelup.lesson6.structure.OneWayList;
import org.levelup.lesson8.homework.MyQueueOutOfBoundsException;

import java.util.Iterator;
import java.util.LinkedList;

public class ForEachExample {
    public static void main(String[] args) throws MyQueueOutOfBoundsException {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer el = iterator.next();
            System.out.println(el);
            if (el == 7) {
                iterator.remove();
            }
        }

        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println();

        OneWayList<String> strings = new OneWayList<>();
        strings.add("s1");
        strings.add("s2");
        strings.add("s3");
        strings.add("s4");

        for (String str : strings) {
            System.out.println(str);
        }
    }
}
