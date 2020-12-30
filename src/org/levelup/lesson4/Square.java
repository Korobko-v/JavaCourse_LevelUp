package org.levelup.lesson4;

public class Square extends Rectangle{
    public Square(int side) {
        super(side, side);
    }
    public int getSide() {
        return sides[0];
    }
}
