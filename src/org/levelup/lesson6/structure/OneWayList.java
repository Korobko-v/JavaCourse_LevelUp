package org.levelup.lesson6.structure;


import org.levelup.lesson8.homework.MyQueueOutOfBoundsException;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class OneWayList <E> implements Structure<E>, Iterable<E> {
    private Element<E> head;
        private int listVersion;

    @Override
    public void add(E value) throws MyQueueOutOfBoundsException {
        Element<E> el = new Element<>(value);
        if (head == null) {
            //означает, что список пустой
            head = el;
        }
        else {
            Element<E> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(el);
        }
        listVersion++;
    }

    @Override
    public void removeByValue(E value) {
        while (head.getValue() == value) {
            if (head.getNext() != null) {
                head = head.getNext();
            }
            else {
                head = null;
            }
        }
        Element<E> curr = head.getNext();
        while (curr.getNext() != null) {
            if (curr.getValue() == value) {
                curr.setValue(curr.getNext().getValue());
            }
            curr = curr.getNext();
        }
        if (curr.getNext() == null && curr.getValue() == value) {
            curr.setValue(null);
        }
        listVersion++;
    }

    @Override
    public boolean contains(E value) {
        Element<E> el = new Element<>(value);
        if (head.getValue() == value) {
            return true;
        }
            Element<E> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
                if (curr.getValue() == value) {
                    return true;
                }
            }
        return false;
    }

    @Override
    public Iterator<E> iterator() {

        return new ListIterator();
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    private class ListIterator implements Iterator<E> {

        private int iteratorVersion = listVersion;
        private Element<E> current = head;
        @Override
        public boolean hasNext() {

            return current != null;
        }

        @Override
        public E next() {
            if (iteratorVersion != listVersion) {
                throw new ConcurrentModificationException();
            }
            E value = current.getValue();
            current = current.getNext();
            return value;
        }
    }
}
