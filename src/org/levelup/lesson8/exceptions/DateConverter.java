package org.levelup.lesson8.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    public Date convertStringToDate(String dateAsString) {
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss");
        try {
            System.out.println("Before parsing: ");
            date = formatter.parse(dateAsString);
            System.out.println("After parsing: ");
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
