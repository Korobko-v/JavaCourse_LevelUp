package org.levelup.lesson3;

public class PointDistanceCalculation {
    double calculateDistance(Point p1, Point p2) {
        double k1 = Math.pow(p1.x - p2.x, 2);
        double k2 = Math.pow(p1.y - p2.y, 2);
        return (Math.sqrt(k1 + k2));
    }

}
