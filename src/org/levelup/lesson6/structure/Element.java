package org.levelup.lesson6.structure;

public class Element<E> {
    private Element<E> next;
    private E value;

    public Element(E value) {
//        this.next = null;
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Element<E> getNext() {
        return next;
    }

    public void setNext(Element<E> next) {
        this.next = next;
    }
}
