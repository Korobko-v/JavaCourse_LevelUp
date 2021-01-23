package org.levelup.lesson6.structure;

import org.levelup.lesson8.homework.MyQueueOutOfBoundsException;

public interface Structure <E> {
    //int size = 50;
    void add(E value) throws MyQueueOutOfBoundsException;

    void removeByValue(E value);

    boolean contains(E value);
}
