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

    Point flip() {
        this.x = -x;
        this.y = -y;
        return new Point(x,y);
    }
    void print() {
        System.out.println(("The point is (" + x + "," + y + ")"));
    }

    double calculateDistance(Point second) {
        double k1 = Math.pow(x - second.x, 2);
        double k2 = Math.pow(y - second.y, 2);
        return (Math.sqrt(k1 + k2));
    }
}
