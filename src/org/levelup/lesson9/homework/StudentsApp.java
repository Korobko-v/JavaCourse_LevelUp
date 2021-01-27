package org.levelup.lesson9.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentsApp {
    public static void main(String[] args) throws IOException {
        File students = new File("students.txt");
      students.createNewFile();
        File faculties = new File("faculties.txt");
//        faculties.createNewFile();

        Student ivan = new Student("Иванов Иван Иванович", 1, 101);
        Student petr = new Student("Петров Пётр Петрович", 2, 102);
        Student grzegorz = new Student("Grzegorz Brzęczyszczykiewicz", 3, 103);


        Map<Integer, String> map = new TreeMap<>();
        map.put(101, "Электромеханический");
        map.put(102, "Нефтехимический");
        map.put(103, "Радиотехнический");
        writeFacultiesListToFile(map);
        getFacultiesList(faculties);
        List<String> facs = getFacultiesList(faculties);
        for (String s : facs) {
            System.out.println(s);
        }

        Student lenka = new Student("Петрова Елена Викторовна", 4, 102);
        System.out.println(lenka.getFacultyName(map));
        System.out.println(ivan.getFacultyName(map));
        System.out.println(petr.getFacultyName(map));
        System.out.println(grzegorz.getFacultyName(map));
        List<String> list = getStudentsList(students);
        for (String s : list) {
            System.out.println(s);
        }
    }


    static List<String> getStudentsList(File file) throws IOException {
        List<String> students = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()) {
                students.add(reader.readLine());
        }
        return students;
    }
    static List<String> getFacultiesList(File file) throws IOException {
        List<String> faculties = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()) {
            faculties.add(reader.readLine());
        }
        return faculties;
    }


    static void writeFacultiesListToFile(Map<Integer, String> map) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("faculties.txt"));
        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
            writer.write(entry.getKey() + ":" + entry.getValue() + "\r\n");
        }
        writer.close();
    }
}