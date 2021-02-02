package org.levelup.lesson6.structure;

import java.util.Iterator;

public class OneWayListIterator <E> implements Iterator<E> {
    private Element<E> current;
    private int iteratorVersion;
//        private int originalVersion = listVersion;
    public OneWayListIterator(Element<E> head, int listVersion) {
        this.current = head;
        this.iteratorVersion = listVersion;
    }

    @Override
    public boolean hasNext() {

        return current != null;
    }

    @Override
    public E next() {
        E value = current.getValue();
        current = current.getNext();
        return value;
    }
}
