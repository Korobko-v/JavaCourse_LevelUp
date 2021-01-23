package org.levelup.lesson8.homework;

public enum GraphicErrorCode {
    NULL("Очередь пуста"),
    FULL("Очередь заполнена");
    private String errorString;

    private GraphicErrorCode(String errorString){

        this.errorString = errorString;
    }

    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    private String getErrorString()
    {
        return this.errorString;
    }
}
