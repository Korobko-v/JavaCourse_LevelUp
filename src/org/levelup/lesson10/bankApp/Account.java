package org.levelup.lesson10.bankApp;

import org.levelup.lesson10.bankApp.exceptions.AccountErrorCode;
import org.levelup.lesson10.bankApp.exceptions.AccountException;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    public int number;
    public Currency currency;
    private int balance;
    private int pin;
    private File file;
    Date date;

    public Date getDate() {
        return date;
    }

    public Account(int number, Currency currency, int pin, String fileName, String stringDate) throws IOException, AccountException {
        this.file = new File(fileName);
        file.createNewFile();

        try {
            this.number = number;
        } catch (Exception e) {
            throw new AccountException(AccountErrorCode.WRONG_ACCOUNT_NUMBER);
        }
        try {
            this.currency = currency;
        } catch (Exception e) {
            throw new AccountException(AccountErrorCode.WRONG_CURRENCY);
        }

        balance = 0;
        this.pin = pin;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy").parse(stringDate);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты. Введите дату в формате \"дд.мм.гггг\"");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write("Номер счёта: " + number + "\r\n");
        bw.write("Валюта: " + currency.toString() + "\r\n");
        bw.write("Дата открытия: " + stringDate  + "\r\n");
        bw.write("Баланс: " + balance  + "\r\n");
        bw.close();
    }

    public File getFile() {
        return file;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getNumber() {
        return number;
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
