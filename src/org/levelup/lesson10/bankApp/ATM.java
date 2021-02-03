package org.levelup.lesson10.bankApp;


import org.levelup.lesson10.bankApp.exceptions.AccountErrorCode;
import org.levelup.lesson10.bankApp.exceptions.AccountException;
import org.levelup.lesson10.bankApp.exceptions.CustomerException;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class ATM {
    public static TreeSet<Account> accounts = new TreeSet<>((o1, o2) -> o1.getNumber() - o2.getNumber());
    static int turns = 3;

    public ATM() throws IOException, AccountException {
    }

//    public static void addAccount(Account account) {
//        accounts.add(account);
//    }

    public static void removeAccount(Account account) {
        accounts.remove(account);
    }

    public static Account getAccountByNumber (int number) {
        for (Account account : accounts) {
            if (account.getNumber() == number) {
                return account;
            }
        }
        return null;
    }

    static void checkPin(Account account) throws AccountException, IOException {

        System.out.println("Введите PIN-код");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int pin = Integer.parseInt(reader.readLine());
        if (pin == account.getPin()) {
            System.out.println("Добро пожаловать!");
            turns = 3;
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

    static void operate() throws IOException, AccountException, CustomerException {

        System.out.println("1: Открыть счёт");
        System.out.println("Другая клавиша: Выбрать счёт");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (Integer.parseInt(reader.readLine()) == 1) {
            createNewAccount();
        }
        else {
            System.out.println("Введите номер счёта: ");
            int num = Integer.parseInt(reader.readLine());
            if (getAccountByNumber(num) == null) {
                throw new AccountException(AccountErrorCode.WRONG_ACCOUNT_NUMBER);
            }
            checkPin(getAccountByNumber(num));


        System.out.println("1. Добавить счёт");
        System.out.println("2. Редактировать баланс");
        System.out.println("3. Закрыть счёт");
        System.out.println("4. Просмотр всех счетов");

        int choice = Integer.parseInt(reader.readLine());
        switch (choice) {
            case (1) :
                createNewAccount();
            case (2) :
                editBalance(getAccountByNumber(num));
            case (3) :
                removeAccount(getAccountByNumber(num));
                System.out.println("Счёт № " + num + " закрыт.");
            case (4) :
                System.out.println("Мои счета: ");
                for (Account account : accounts) {
                    System.out.println("№" + account.getNumber() + ". " + "Баланс: " + account.getBalance() + " " + account.getCurrency().toString() + ". Дата открытия: " + new SimpleDateFormat("dd.MM.yyyy").format(account.getDate()));
                }
        }
        }
        System.out.println();
        System.out.println("1: Другая операция");
        System.out.println("Другая клавиша: Выход");

        if (Integer.parseInt(reader.readLine()) == 1) {
            operate();
        }
        else {
            System.exit(0);
        }
    }
       static void createNewAccount() throws AccountException, IOException, CustomerException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите номер счёта");
            int newAccNumber = Integer.parseInt(br.readLine());
            if (getAccountByNumber(newAccNumber) != null) {
                throw new AccountException(AccountErrorCode.ACCOUNT_DUPLICATE);
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

            System.out.println("Введите дату в формате \"дд.мм.гггг\"");
            String stringDate = br.readLine();

            Account newAcc = new Account(newAccNumber, currency, pin, newAccNumber + "_" + currency.toString() + ".txt", stringDate);
            accounts.add(newAcc);
            BufferedWriter bw = new BufferedWriter(new FileWriter(newAcc.getFile().getName()));
            System.out.println("Счёт № " + newAcc.getNumber() + " открыт.");
            System.out.println("Номер счёта: " + newAcc.getNumber());
            bw.write("Номер счёта: " + newAcc.getNumber() + "\r\n");
            System.out.println("Валюта: " + newAcc.currency.toString());
            bw.write("Валюта: " + newAcc.currency.toString() + "\r\n");
            bw.write("Дата открытия: " + new SimpleDateFormat("dd.MM.yyyy").format(newAcc.getDate())  + "\r\n");
            bw.write("Баланс: " + newAcc.getBalance()  + "\r\n");
            bw.close();
//            br.close();
           System.out.println();
           System.out.println("1: Другая операция");
           System.out.println("Другая клавиша: Выход");

           if (Integer.parseInt(br.readLine()) == 1) {
               operate();
           }
           else {
               System.exit(0);
           }
        }

       static void editBalance(Account account) throws IOException, AccountException, CustomerException {
            System.out.println("1. Внести наличные");
            System.out.println("2. Снять наличные");
            System.out.println("3. Баланс");

            BufferedReader edReader = new BufferedReader(new InputStreamReader(System.in));
            int choice = Integer.parseInt(edReader.readLine());
            File receipt;
            File accountFile = account.getFile();
            BufferedWriter accountWriter = new BufferedWriter(new FileWriter(accountFile, true));
            if (choice == 1) {
                System.out.println("Введите сумму: ");
                int sum = Integer.parseInt(edReader.readLine());
                account.setBalance(account.getBalance() + sum);
                accounts.add(account);
                receipt = new File(account.getCurrency() + "_" + String.valueOf(sum) + "_deposit.txt");
                receipt.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(receipt.getName()));
                bw.write("Зачисление " + sum + " " + account.getCurrency().toString() + ". Операция прошла успешно." + " Баланс: " + account.getBalance() + " " + account.getCurrency().toString() + "\r\n");
                bw.write(new SimpleDateFormat("dd.MM.yyyy kk:mm:ss").format(new Date().getTime()));
                accountWriter.write(" Баланс: " + account.getBalance() + "\r\n");
                bw.close();
                accountWriter.close();
            }

            if (choice == 2) {
                System.out.println("Введите сумму: ");
                int div = Integer.parseInt(edReader.readLine());
                if (account.getBalance() - div < 0) {
                    System.out.println("Недостаточно средств");
                    throw new AccountException(AccountErrorCode.NEGATIVE_BALANCE);
                }
                account.setBalance(account.getBalance() - div);
                accounts.add(account);
                receipt = new File(account.currency + "_withdrawal.txt");
                receipt.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(receipt.getName()));
                bw.write("Выдача " + div + " " + account.getCurrency().toString() + ". Операция прошла успешно" + " Баланс: " + account.getBalance() + " " + account.getCurrency().toString() + "\r\n");
                bw.write(new SimpleDateFormat("dd.MM.yyyy kk:mm:ss").format(new Date().getTime()));
                accountWriter.write("\r\n" + " Баланс: " + account.getBalance() + "\r\n");
                bw.close();
                accountWriter.close();
            }

            if (choice == 3) {
                System.out.println("Баланс: " + account.getBalance() + " " + account.getCurrency().toString());
            }

            System.out.println("1: Другая операция");
            System.out.println("Другая клавиша: Выход");

            if (Integer.parseInt(edReader.readLine()) == 1) {
                operate();
            }
            else {
                System.exit(0);
            }

//            edReader.close();
        }
}
