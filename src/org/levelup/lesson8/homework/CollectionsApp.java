package org.levelup.lesson8.homework;



import org.levelup.lesson6.structure.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsApp {
    public static void main(String[] args) throws MyQueueOutOfBoundException {
        Set<Object> set1 = new HashSet<>();
        Set<Object> set2 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(4);
        set1.add(77);
        set1.add(1);
        set1.add(3);
        set2.add(4);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(77);

        System.out.println(SetsApp.union(set1, set2));
        System.out.println(SetsApp.intersect(set1, set2));

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "a");
        map.put(3, "b");
        map.put(4, "c");
        map.put(5, "d");
        map.put(6, "e");

        MapsApp ma = new MapsApp();
        System.out.println(ma.swap(map));

        MyQueue<String> queue = new MyQueue<>(2);
        queue.add("Вова");
        queue.add("Дима");
        queue.add("Андрей");
        System.out.println(queue.take().getValue());
        System.out.println(queue.take().getValue());

    }
}
