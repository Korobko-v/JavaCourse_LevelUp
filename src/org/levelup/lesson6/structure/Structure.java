package org.levelup.lesson6.structure;

public interface Structure <E> {
    //int size = 50;
    void add(E value);

    void removeByValue(E value);

    boolean contains(E value);
}
