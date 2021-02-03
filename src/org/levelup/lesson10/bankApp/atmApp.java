package org.levelup.lesson10.bankApp;

import org.levelup.lesson10.bankApp.exceptions.AccountException;
import org.levelup.lesson10.bankApp.exceptions.CustomerException;

import java.io.IOException;

import static org.levelup.lesson10.bankApp.ATM.*;

public class atmApp {

    public static void main(String[] args) throws IOException, AccountException, CustomerException {
//        Account account1 = new Account(100, Currency.RUB, 1234, "100_RUB.txt", "03.02.2021");
//        accounts.add(account1);
        operate();
    }
}
