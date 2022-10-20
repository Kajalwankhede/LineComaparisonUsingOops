package com.linecomarison;

public class LineComputationComparison {
    private int firsLineX1;
    private int firsLineX2;
    private int firsLineY1;
    private int firsLineY2;
    private int secondLineX1;
    private int secondLineX2;
    private int secondLineY1;
    private int secondLineY2;

    public int getFirstLineX1Coordinate() {
        return firsLineX1;
    }

    public void setFirstLineX1Coordinate(int firsLineX1) {
        this.firsLineX1 = firsLineX1;
    }

    public int getFirstLineX2Coordinate() {
        return firsLineX2;
    }

    public void setFirstLineX2Coordinate(int firsLineX2) {
        this.firsLineX2 = firsLineX2;
    }

    public int getFirstLineY1Coordinate() {
        return firsLineY1;
    }

    public void setFirstLineY1Coordinate(int firsLineY1) {
        this.firsLineY1 = firsLineY1;
    }

    public int getFirstLineY2Coordinate() {
        return firsLineY2;
    }

    public void setFirstLineY2Coordinate(int firsLineY2) {
        this.firsLineY2 = firsLineY2;
    }

    public int getSecondLineX1Coordinate() {
        return secondLineX1;
    }

    public void setSecondLineX1Coordinate(int secondLineX1) {
        this.secondLineX1 = secondLineX1;
    }

    public int getSecondLineX2Coordinate() {
        return secondLineX2;
    }

    public void setSecondLineX2Coordinate(int secondLineX2) {
        this.secondLineX2 = secondLineX2;
    }

    public int getSecondLineY1Coordinate() {
        return secondLineY1;
    }

    public void setSecondLineY1Coordinate(int secondLineY1) {
        this.secondLineY1 = secondLineY1;
    }

    public int getSecondLineY2Coordinate() {
        return secondLineY2;
    }

    public void setSecondLineY2Coordinate(int secondLineY2) {
        this.secondLineY2 = secondLineY2;
    }

    @Override
    public String toString() {
        return "\nTwo Line Computation Comparison Coordinates are: {" +
                "\n FirsLineX1Coordinate : " + firsLineX1 +
                ",\n FirsLineX2Coordinate: " + firsLineX2 +
                ",\n FirsLineY1Coordinate:" + firsLineY1 +
                ",\n FirsLineY2Coordinate: " + firsLineY2 +
                ",\n SecondLineX1Coordinate: " + secondLineX1+
                ",\n SecondLineX2Coordinate: " + secondLineX2+
                ",\n SecondLineY1Coordinate: " + secondLineY1 +
                ",\n SecondLineY2Coordinate: " + secondLineY2 +
                '}';
    }
}
