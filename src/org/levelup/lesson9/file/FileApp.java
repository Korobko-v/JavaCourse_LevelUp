package org.levelup.lesson9.file;

import java.io.File;
import java.io.IOException;

public class FileApp {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        ReadFile readFile = new ReadFile();
        readFile.readAndPrintFileAsStream(file);

        File f = new File("write_file.txt");
        f.createNewFile();
        readFile.writeToFile(f, "I love Java");
        readFile.readAndPrintFileAsStream(f);
    }
}
