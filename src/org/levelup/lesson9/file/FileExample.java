package org.levelup.lesson9.file;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("ALL")
public class FileExample {
    public static void main(String[] args) throws IOException {
        File textFile = new File("text_file.txt");
        File notExistingFile = new File ("newTest.txt");
        System.out.println(textFile == null);
        System.out.println(notExistingFile == null);

        if(!notExistingFile.exists()) {
           boolean result = notExistingFile.createNewFile();
            System.out.println("Результат создания файла: " + result);
        }

        File srcDir = new File("src/");
        System.out.println("Is directory exists: " + srcDir.exists());
        System.out.println("Is directory: " + srcDir.isDirectory());
        System.out.println("Is file: " + srcDir.isFile());

        File tempDir = new File("temp/");
        boolean result = tempDir.mkdir();
        System.out.println(result);
    }
}
