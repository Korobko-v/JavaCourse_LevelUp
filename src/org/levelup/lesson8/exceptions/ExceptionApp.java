package org.levelup.lesson8.exceptions;

import java.util.Date;

public class ExceptionApp {
    public static void main(String[] args) {
        DateConverter converter = new DateConverter();
        String string = "22:01:2021 11:45:00";
        Date date = converter.convertStringToDate(string);
        System.out.println(date);
    }
}
