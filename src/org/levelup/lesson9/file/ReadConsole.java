package org.levelup.lesson9.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your code: ");
        String line = reader.readLine();
        
        int code = Integer.parseInt(line);
        System.out.println("Code as int: " + code);

    }
}
