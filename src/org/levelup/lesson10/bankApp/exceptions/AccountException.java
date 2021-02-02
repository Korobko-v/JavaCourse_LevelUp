package org.levelup.lesson10.bankApp.exceptions;

import org.levelup.lesson10.bankApp.Account;

public class AccountException extends Throwable {
    private AccountErrorCode accountErrorCode;

    public AccountException(AccountErrorCode accountErrorCode) {

        this.accountErrorCode = accountErrorCode;
    }

    public AccountErrorCode getErrorCode() {
        return accountErrorCode;
    }

}
