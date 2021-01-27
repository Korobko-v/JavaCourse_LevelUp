package org.levelup.lesson9;

public class Stack<T> {
    private Object[] elements;
    private int headIndex;

    public Stack(int capacity) {
        this.elements = new Object[capacity];
    }

    public void push(T value) throws StackOverFlowException {
        if (headIndex == elements.length) {
            throw new StackOverFlowException(elements.length);
        }
        elements[headIndex++] = value;
    }

    public T pop() {
        if (headIndex == 0) {
            throw new EmptyStackException();
        }
        return (T)elements[--headIndex];
    }
}
