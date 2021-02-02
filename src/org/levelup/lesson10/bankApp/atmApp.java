package org.levelup.lesson10.bankApp;

import org.levelup.lesson10.bankApp.exceptions.AccountErrorCode;
import org.levelup.lesson10.bankApp.exceptions.AccountException;
import org.levelup.lesson10.bankApp.exceptions.CustomerException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atmApp {
    public static void main(String[] args) throws IOException, AccountException, CustomerException {
        Customer ivan = new Customer("Иван Иванов");
        ATM atm = new ATM();
        Account account1 = new Account(100, "Иван Иванов", Currency.RUB, 1234, "1234.txt");
        atm.addAccount(account1);
        atm.start();
        atm.operate(account1);

    }
}
