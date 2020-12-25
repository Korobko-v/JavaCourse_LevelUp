package org.levelup.lesson3;

public class Point {

    // Поле класса
    int x;
    int y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point () {
        this.x = 1;
        this.y = 2;
    }

    void changeCoordinates(int x1, int y1) {
        if (x1 >= 0) {
            this.x = x1;
        }
        if (y1 >= 0) {
            this.y = y1;
        }
        if (x1 < 0) {
            this.x = Math.abs(x1);
        }
        if (y1 < 0) {
            this.y = Math.abs(y1);
        }
    }

    void printPoint() {
//        System.out.println("(" + x + ", " + y + ")");
        printPoint("");
    }

    //Перегрузка
    void printPoint (String pointName) {

        System.out.println(pointName + "(" + this.x + ", " + this.y + ")");
    }

    void flip(int x1, int y1) {
        this.x = -x1;
        this.y = -y1;
    }
}
