package org.levelup.lesson7;

public class GenericMethod {
    private Object[] array;

    public <TYPE> TYPE findByIndex(int index) {
        return (TYPE) array[index];
    }

    public GenericMethod() {
        this.array = new Object[]{
                "Hello",
                23,
                "aaa"};

    }


}
