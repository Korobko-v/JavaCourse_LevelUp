package org.levelup.lesson8.homework;

import java.util.HashSet;
import java.util.Set;

public class SetsApp {
    static Set<Object> union(Set<Object> set1, Set<Object> set2) {
        Set<Object> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }
    static Set<Object> intersect(Set<Object> set1, Set<Object> set2) {
        Set<Object> set = new HashSet<>();
        for (Object o : set1) {
            if (set2.contains(o)) {
                set.add(o);
            }
        }
        return set;
    }
}
