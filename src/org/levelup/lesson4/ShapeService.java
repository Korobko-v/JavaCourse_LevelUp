package org.levelup.lesson4;

public class ShapeService {
    public void printShapePerimeters(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calculatePerimeter());
        }
    }
}
