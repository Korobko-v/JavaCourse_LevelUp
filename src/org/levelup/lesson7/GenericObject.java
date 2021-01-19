package org.levelup.lesson7;

public class GenericObject<TYPE> {

    private TYPE field;

    public TYPE getField() {
        return field;
    }

    public void setField(TYPE field) {
        this.field = field;
    }
}
