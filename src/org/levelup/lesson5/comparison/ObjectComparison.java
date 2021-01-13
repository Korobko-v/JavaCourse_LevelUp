package org.levelup.lesson5.comparison;

public class ObjectComparison {
    public static void main(String[] args) {
        Computer c1 = new Computer("HP", 8);
        Computer c2 = new Computer("HP", 8);
        Computer c3 = c1;
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 == c3: " + (c1 == c3));



        boolean isEqual = c1.equals(c2);
        System.out.println("c1.equals(c2): " + isEqual);
    }
}
