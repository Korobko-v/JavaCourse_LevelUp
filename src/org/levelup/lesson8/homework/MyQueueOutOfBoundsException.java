package org.levelup.lesson8.homework;

public class MyQueueOutOfBoundsException extends Exception {

    private GraphicErrorCode graphicErrorCode;

    public MyQueueOutOfBoundsException(GraphicErrorCode graphicErrorCode) {

        this.graphicErrorCode = graphicErrorCode;
    }

    public GraphicErrorCode getGraphicErrorCode() {
        return graphicErrorCode;
    }
}
