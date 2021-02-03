package org.levelup.lesson10.bankApp.exceptions;

public class CustomerException extends Exception {
    private CustomerErrorCode customerErrorCode;

    public CustomerException(CustomerErrorCode customerErrorCode) {

        this.customerErrorCode = customerErrorCode;
    }

    public CustomerErrorCode getErrorCode() {
        return customerErrorCode;
    }
}
