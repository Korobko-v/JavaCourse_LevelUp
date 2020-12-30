package org.levelup.lesson3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class App {
    public static void main(String[] args) {
//        int[] xValues = new int[3];
//        int[] yValues = new int[3];
//        int[] zValues = new int[3];
//        int i = 0;
//
        Point pointA = new Point();
        pointA.x = -453;
        pointA.y = 1353;

        System.out.println("A(" + pointA.x + ", " + pointA.y + ")");
//        Point pointB = new Point();
//        pointB.x = 12;
//        pointB.y = 43;
//        System.out.println("B(" + pointB.x + ", " + pointB.y + ")");
//
//        pointA.changeCoordinates(pointA.x, pointA.y);
//        System.out.println("A(" + pointA.x + ", " + pointA.y + ")");
//
//        System.out.println();
//        pointA.printPoint();
//        pointB.printPoint();
//
//        System.out.println();
//        pointA.printPoint("A");
//
//        Point pointC = new Point (35 , 8);
//        pointC.printPoint("C");

        Calculator calculator = new Calculator();
        calculator.add(2, 2);
        calculator.multiply(2.2, 5);
        calculator.subtract(3,2);
        calculator.divide(1.5, 2);

        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println(arrayUtil.max(new int[] {15, 28, 8 , 55, 84}));
        System.out.println(arrayUtil.min(new int[] {15, 28, 8 , 55, 84}));


        int[] arr = new int[] { 2 , 18, 29, 5, 732, 200};
        ArraySorting arraySorting = new ArraySorting(arr);
        arraySorting.bubbleSort(arr);
        System.out.println("Отсортированный массив");
        for (int a : arr) {
            System.out.println(a);
        }
        Point toFlip = new Point(2,-5);
        toFlip.print();
        toFlip.flip();
        toFlip.print();

    }
}

