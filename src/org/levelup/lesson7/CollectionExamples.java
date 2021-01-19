package org.levelup.lesson7;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExamples {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("Hello");
        words.add("Java");
        words.add("Aaa");
        words.add("kek");
        words.add("World");

        for (String s : words) {
            System.out.println(s);
        }
        System.out.println("Размер коллекции: " + words.size());
        List<String> subWords = words.subList(1,4);
        for (String s : subWords) {
            System.out.println(s);
        }
        System.out.println(words.get(0));
    }
}
