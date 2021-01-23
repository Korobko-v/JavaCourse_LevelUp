package org.levelup.lesson8.homework;

public class MyQueueOutOfBoundException extends Exception {

    private GraphicErrorCode graphicErrorCode;

    public MyQueueOutOfBoundException(GraphicErrorCode graphicErrorCode) {

        this.graphicErrorCode = graphicErrorCode;
    }

    public GraphicErrorCode getGraphicErrorCode() {
        return graphicErrorCode;
    }
}
