package org.levelup.lesson8.homework;

import org.levelup.lesson6.structure.Element;
import org.levelup.lesson6.structure.OneWayList;

import java.util.Queue;

public class MyQueue<E> extends OneWayList<E> {
    private Element<E> tail;
    private Element<E> head;
    int size;
    static int count = 0;
    public MyQueue(int size) {
        Element[] elements = new Element[size];
        this.size = size;
    }

    @Override
    public void add(E value) throws MyQueueOutOfBoundException {

        Element<E> el = new Element<>(value);
        if (head == null) {
            count++;
            head = el;

        }
        else {
            Element<E> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            count++;
            curr.setNext(el);
        }
        if (count > size) {
            throw new MyQueueOutOfBoundException(GraphicErrorCode.FULL);
        }
    }

    public Element<E> take() throws MyQueueOutOfBoundException {
        if (head == null) {
            throw new MyQueueOutOfBoundException(GraphicErrorCode.NULL);

        }
        Element<E> el = head;
        head = head.getNext();
        return el;
    }

}
