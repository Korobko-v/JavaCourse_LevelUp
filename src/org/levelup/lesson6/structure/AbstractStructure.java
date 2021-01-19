package org.levelup.lesson6.structure;

public abstract class AbstractStructure {

    protected int size;

    public abstract void addLast(int value);

    public abstract void removeByIndex(int index);
    public abstract void removeByValue(int value);

    public abstract int getByIndex(int index);
    public abstract void trim();

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
