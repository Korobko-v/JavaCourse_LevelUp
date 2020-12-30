package org.levelup.lesson3;

public class DistanceApp {
    public static void main(String[] args) {
        //Расстояние между двумя точками
        Point p1 = new Point(4, 6);
        Point p2 = new Point(8,9);
        // 1 способ
        // Метод CalculateDistance в классе Point
        // 2 способ
        // Метод CalculateDistance в другом классе (например, PointService)

        // 1 Способ
        // double calculateDistance(Point p2)
        // 1 Способ
        // double calculateDistance(int x1, int y1, int x2, int y2)

        PointDistanceCalculation calc = new PointDistanceCalculation();
        double distance = calc.calculateDistance(p1, p2);
        System.out.println("Расстояние между точками: " + distance);
        double distance2 = p1.calculateDistance(p2);
        System.out.println("Расстояние между точками: " + distance2);



    }
}
