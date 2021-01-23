package org.levelup.lesson6.structure;

import org.levelup.lesson8.homework.MyQueueOutOfBoundException;

public interface Structure <E> {
    //int size = 50;
    void add(E value) throws MyQueueOutOfBoundException;

    void removeByValue(E value);

    boolean contains(E value);
}
