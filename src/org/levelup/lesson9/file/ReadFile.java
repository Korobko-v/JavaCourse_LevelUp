package org.levelup.lesson9.file;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.levelup.lesson2.Array;

import java.io.*;
import java.util.Arrays;

public class ReadFile {
    public void readAndPrintFile (File file){
//        FileReader fileReader = new FileReader(file);
//        char[] buf = new char[1024];
//        int readCount = fileReader.read(buf); //количество прочитанных символов
//        int readCountBuf = fileReader.read(buf, 100, 150);

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Невозможно закрыть соединение к файлу.");
                }
            }
        }
    }
    public void readAndPrintFileAsStream(File file) {
        //try-with-resources
        //try(объект, реализующий интерфейс AutoClosable) {}

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
//            byte[] buffer = new byte[2048];
            byte[] buffer = new byte[100];
            int readCount = 0;
            while ( (readCount = bufferedInputStream.read(buffer)) >= 0) {
                String text = new String(buffer, 0, readCount);
                // System.out.println(Arrays.toString(buffer));
                System.out.println(text);
                System.out.println("----");
            }

        }
        catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }

    }
    public void writeToFile(File file, String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(message);
            writer.newLine();

        }
        catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }

    }
}
