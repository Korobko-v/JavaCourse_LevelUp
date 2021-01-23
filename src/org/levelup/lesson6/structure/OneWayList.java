package org.levelup.lesson6.structure;


import org.levelup.lesson8.homework.MyQueueOutOfBoundsException;

public class OneWayList <E> implements Structure<E> {
    private Element<E> head;

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
}
