package org.levelup.lesson8;

import org.levelup.lesson8.compare.Phone;
import org.levelup.lesson8.compare.PhonePriceComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Phone", 5);
        map.put("Computer", 10);
        map.put("Monitor", 43);
        map.put("HDD", 22);
        map.put("RAM", 32);

//        Set<String> keys = map.keySet();
//        for (String key: keys) {
//            Integer value = map.get(key);
//            System.out.println("Key: " + key + " Value: " + value);
//        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }


        Map<Phone, String> treeMap = new TreeMap<>();
        Map<Phone, String> treeMapWithComparator = new TreeMap<>(new PhonePriceComparator());

    }


}
