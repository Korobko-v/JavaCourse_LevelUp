package org.levelup.lesson10.bankApp;


import org.levelup.lesson10.bankApp.exceptions.AccountErrorCode;
import org.levelup.lesson10.bankApp.exceptions.AccountException;
import org.levelup.lesson10.bankApp.exceptions.CustomerException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ATM {
    private List<Account> accounts;
    static int turns = 3;
    public ATM() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    public Account getAccountByNumber (int number) {
        for (Account account : this.accounts) {
            if (account.getNumber() == number) {
                return account;
            }
        }
        return null;
    }

    public Account getAccountByName(String name) {
        for (Account account : this.accounts) {
            if (account.getHolderName().equals(name)) {
                return account;
            }
        }
        return null;
    }

    void start() throws AccountException, IOException {
        System.out.println("Введите номер счёта: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (getAccountByNumber(num) == null) {
            throw new AccountException(AccountErrorCode.WRONG_ACCOUNT_NUMBER);
        }
    }

    void checkPin(Account account) throws AccountException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите PIN-код");
        int pin = Integer.parseInt(reader.readLine());
        if (pin == account.getPin()) {
            System.out.println("Добро пожаловать!");
        }
        else {
            turns--;
            System.out.println("Осталось попыток:" + turns);
            if (turns == 0) {
                throw new AccountException(AccountErrorCode.WRONG_PIN);
            }
            checkPin(account);
        }
    }

    void operate(Account account) throws IOException, AccountException, CustomerException {
        checkPin(account);
        System.out.println("1. Добавить счёт");
        System.out.println("2. Редактировать баланс");
        System.out.println("3. Закрыть счёт");
        System.out.println("4. Просмотр всех счетов");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(reader.readLine());
        switch (choice) {
            case (1) :
                createNewAccount();
            case (2) :
                editBalance(account);
        }
    }
        void createNewAccount() throws AccountException, IOException, CustomerException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите номер счёта");
            int newAccNumber = Integer.parseInt(br.readLine());
            if (getAccountByNumber(newAccNumber) != null) {
                throw new AccountException(AccountErrorCode.ACCOUNT_DUPLICATE);
            }
            System.out.println("Введите имя");
            String holderName = br.readLine();
            Customer customer;
            if (getAccountByName(holderName) == null) {
                customer = new Customer(holderName);
            }

            System.out.println("Выберите валюту");
            String curr = br.readLine();
            Currency currency = null;
            if (curr.equalsIgnoreCase("RUB")) {
                currency = Currency.RUB;
            }
            if (curr.equalsIgnoreCase("USD")) {
                currency = Currency.USD;
            }
            if (curr.equalsIgnoreCase("EUR")) {
                currency = Currency.EUR;
            }

            System.out.println("Введите PIN");
            int pin = Integer.parseInt(br.readLine());



            Account newAcc = new Account(newAccNumber, holderName, currency, pin, newAccNumber + "_" + holderName + ".txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(newAcc.getFile().getName()));
            System.out.println("Счёт успешно добавлен.");
            System.out.println("Номер счёта: " + newAcc.getNumber());
            bw.write("Номер счёта: " + newAcc.getNumber() + "\r\n");
            System.out.println("Имя владельца: " + newAcc.getHolderName());
            bw.write("Имя владельца: " + newAcc.getHolderName() + "\r\n");
            System.out.println("Валюта: " + newAcc.currency.toString());
            bw.write("Валюта: " + newAcc.currency.toString() + "\r\n");
            bw.close();
        }

        void editBalance(Account account) throws IOException, AccountException {
            System.out.println("1. Внести наличные");
            System.out.println("2. Снять наличные");
            BufferedReader edReader = new BufferedReader(new InputStreamReader(System.in));
            int choice = Integer.parseInt(edReader.readLine());
            File receipt = null;
            if (choice == 1) {
                System.out.println("Введите сумму: ");
                int sum = Integer.parseInt(edReader.readLine());
                account.setBalance(account.getBalance() + sum);
                receipt = new File(account.getHolderName() + String.valueOf(sum) + "_deposit.txt");
                receipt.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(receipt.getName()));
                bw.write("Зачисление " + sum + " " + account.getCurrency().toString() + ". Операция прошла успешно");
                bw.close();
            }
            if (choice == 2) {
                System.out.println("Введите сумму: ");
                int div = Integer.parseInt(edReader.readLine());
                if (account.getBalance() - div < 0) {
                    System.out.println("Недостаточно средств");
                    throw new AccountException(AccountErrorCode.NEGATIVE_BALANCE);
                }
                account.setBalance(account.getBalance() - div);
                receipt = new File(account.getHolderName() + "_withdrawal.txt");
                receipt.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(receipt.getName()));
                bw.write("Снятие " + div + " " + account.getCurrency().toString() + ". Операция прошла успешно");
                bw.close();
            }

        }
}
