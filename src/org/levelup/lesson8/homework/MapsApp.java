package org.levelup.lesson8.homework;

import java.util.*;

public class MapsApp<K,V> {

//    Map<V, Collection<K>> swap(Map<K, V> map1) {
//        Map<V, Collection<K>> map = new HashMap<V, Collection<K>>();
//        for (Map.Entry<K, V> entry : map1.entrySet()) {
//            K key = entry.getKey();
//            V value = entry.getValue();
//            List<K> newValue = new ArrayList<>();
//            newValue.add(key);
//            map.put(value, newValue);
//        }
//
//        return map;
//    }
    Map<Collection<V>, K> swap(Map<K, V> map1) {
        Map<Collection<V>, K> map = new HashMap<Collection<V>, K>();

        for (Map.Entry<K, V> entry : map1.entrySet()) {

            K key = entry.getKey();
            V value = entry.getValue();
            map.put(new ArrayList<V>(){{add(value);}}, key);
        }

        return map;
    }
}
