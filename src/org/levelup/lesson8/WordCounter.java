package org.levelup.lesson8;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer " +
                "took a galley of type and scrambled it to make a type specimen book. It has survived not only five " +
                "centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was " +
                "popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more " +
                "recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";

         String replace = text.replace("[.,]", "").replace("'s", "").toLowerCase();
         String[] words = replace.split(" ");

        Map<String, Integer> wordCounter = new TreeMap<>();

        for (String word : words) {
            Integer count = wordCounter.get(word);
                if (count == null) {
                    wordCounter.put(word, 1);
                }
                else {
                    wordCounter.put(word, count+1);
                }
            }

        Set<Map.Entry<String, Integer>> entries = wordCounter.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Word: " + key + "; Times: " + value);
        }
    }
}
