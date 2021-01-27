package org.levelup.lesson9.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Student {
    String name;
    int id;
    int fID;

    public Student(String name, int id, int fID) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt", true));
        writer.write(name + ":" + id + ":" + fID + "\r\n");
        writer.close();
        this.name = name;
        this.id = id;
        this.fID = fID;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getfID() {
        return fID;
    }

    public void setfID(int fID) {
        this.fID = fID;
    }

    String getFacultyName (Map <Integer, String> facultiesMap) {

        return facultiesMap.get(fID);
    }
}

