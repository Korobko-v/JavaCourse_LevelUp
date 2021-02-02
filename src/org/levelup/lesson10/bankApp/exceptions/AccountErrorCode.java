package org.levelup.lesson10.bankApp.exceptions;

public enum AccountErrorCode {
    WRONG_ACCOUNT_NUMBER("Неверный номер"),
    NULL_ACCOUNT_HOLDER("Пользователя не существует"),
    WRONG_CURRENCY("Неверная валюта"),
    ACCOUNT_DUPLICATE("Номер счёта занят"),
    NEGATIVE_BALANCE("Недостаточно средств для совершения операции"),
    WRONG_PIN("Неверный PIN");

    private String errorString;

    AccountErrorCode(String errorString){

        this.errorString = errorString;
    }

    private String getErrorString() {

        return errorString;
    }
}
