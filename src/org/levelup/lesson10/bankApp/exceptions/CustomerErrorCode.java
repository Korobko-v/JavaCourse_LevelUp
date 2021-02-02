package org.levelup.lesson10.bankApp.exceptions;

public enum CustomerErrorCode {
    WRONG_CUSTOMER_NAME("Неверное имя"),
    WRONG_ID("Неверный номер");

    private String errorString;

    CustomerErrorCode(String errorString){

        this.errorString = errorString;
    }

    private String getErrorString() {

        return errorString;
    }
}
