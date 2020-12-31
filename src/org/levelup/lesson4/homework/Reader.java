package org.levelup.lesson4.homework;

import org.levelup.lesson2.Array;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reader {
    String name;
    int id;
    String department;
    String birthDate;
    String phoneNumber;

    static List <Reader> readers = new ArrayList<Reader>();
    static int count = 1;
    public Reader(String name, int id, String department, String birthDate, String phoneNumber) {
        this.name = name;
        this.id = count;
        this.department = department;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        readers.add(this);
        count++;
    }


    public static void main(String[] args) {
        Book wp = new Book("Л.Н. Толстой" , "Война и мир");
        Book sk = new Book("Стивен Кинг" , "11/22/63");
        Book rb = new Book("Рэй Брэдбери" , "451 по Фаренгейту");

        Reader terentiev = new Reader("Терентьев Михаил Павлович", count, "Исторический",
                "03.08.1990", "89009999999");
        Reader ivanov = new Reader("Иванов Иван Иванович", count, "Математический",
                "12.05.1997", "89009999999");
        Reader petrov = new Reader("Петров Олег Семёнович", count, "Филологический",
                "16.04.1992", "89136052278");

        terentiev.takeBook(11);
        ivanov.takeBook(new Book[] {sk, wp, rb});
        terentiev.returnBook(4);
        ivanov.returnBook(new Book[] {sk, rb});


        for (Reader reader : readers) {
            System.out.println(reader.name + " " + reader.id);
        }
    }


    void takeBook(int countOfBooks) {
        String book = "книг";
        if (!String.valueOf(countOfBooks).endsWith("11") && String.valueOf(countOfBooks).endsWith("1")) {
            book = "книгу";
        }

        else if (String.valueOf(countOfBooks).endsWith("12") || String.valueOf(countOfBooks).endsWith("13")
        || String.valueOf(countOfBooks).endsWith("14")) {
            book = "книг";
        }

        else if (String.valueOf(countOfBooks).endsWith("2") || String.valueOf(countOfBooks).endsWith("3")
                || String.valueOf(countOfBooks).endsWith("4")) {
            book = "книги";
        }
        System.out.println(this.name + " взял " + countOfBooks + " " + book + ".");
    }
    void takeBook(Book[] books) {
        String output = "";
        System.out.print(name + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            output += (i == books.length-1) ? (books[i].title + ".") : (books[i].title + ", ") ;
        }

        System.out.println(output);
    }
    void returnBook(int countOfBooks) {
        String book = "книг";
        if (!String.valueOf(countOfBooks).endsWith("11") && String.valueOf(countOfBooks).endsWith("1")) {
            book = "книгу";
        }

        else if (String.valueOf(countOfBooks).endsWith("12") || String.valueOf(countOfBooks).endsWith("13")
                || String.valueOf(countOfBooks).endsWith("14")) {
            book = "книг";
        }

        else if (String.valueOf(countOfBooks).endsWith("2") || String.valueOf(countOfBooks).endsWith("3")
                || String.valueOf(countOfBooks).endsWith("4")) {
            book = "книги";
        }
        System.out.println(this.name + " вернул " + countOfBooks + " " + book + ".");
    }
    void returnBook(Book[] books) {
        String output = "";
        System.out.print(name + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            output += (i == books.length-1) ? (books[i].title + ".") : (books[i].title + ", ") ;
        }

        System.out.println(output);
    }
}
