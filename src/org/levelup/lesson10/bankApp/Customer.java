package org.levelup.lesson10.bankApp;

import org.levelup.lesson10.bankApp.exceptions.CustomerErrorCode;
import org.levelup.lesson10.bankApp.exceptions.CustomerException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Customer {
    private String name;
    public static int id = 0;

    public Customer(String name) throws CustomerException, IOException {

        if (name == null || name.equals("")) {
            throw new CustomerException(CustomerErrorCode.WRONG_CUSTOMER_NAME);
        }
        this.name = name;
            this.id = id++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
