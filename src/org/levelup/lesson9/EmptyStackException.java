package org.levelup.lesson9;

public class EmptyStackException extends  RuntimeException {
    public EmptyStackException() {
        super("Stack is empty");
    }
}
