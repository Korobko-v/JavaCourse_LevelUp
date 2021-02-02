package org.levelup.lesson10.bankApp;

import org.levelup.lesson10.bankApp.exceptions.AccountErrorCode;
import org.levelup.lesson10.bankApp.exceptions.AccountException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Account {
    public int number;
    private String holderName;
    public Currency currency;
    private int balance;
    private int pin;
    private File file;

    public File getFile() {
        return file;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getHolderName() {

        return holderName;
    }

    public int getNumber() {
        return number;
    }



    public Account(int number, String holderName, Currency currency, int pin, String fileName) throws IOException, AccountException {
        this.file = new File(fileName);
        file.createNewFile();

        try {
            this.number = number;
        } catch (Exception e) {
            throw new AccountException(AccountErrorCode.WRONG_ACCOUNT_NUMBER);
        }


        this.holderName = holderName;

        try {
            this.currency = currency;
        } catch (Exception e) {
            throw new AccountException(AccountErrorCode.WRONG_CURRENCY);
        }

        this.balance = 0;
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) throws IOException {
        this.balance = balance;
    }
}
