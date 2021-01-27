package org.levelup.lesson9;

public class StackOverFlowException extends Exception {
    public StackOverFlowException(int capacity) {
        super("Stack is full. Stack capacity is " + capacity);
    }
}
