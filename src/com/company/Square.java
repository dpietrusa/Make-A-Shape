package com.company;

public class Square {

    private double length;


    public void setLength(double sideLength) {
        length = sideLength;
    }
    public double getLength() {
        return length;
    }


    public double calculatePerimiter(double length) {
        double perimiter = length * 4;
        return perimiter;
    }

    public double calculateArea(double length) {
        double area = length * length;
        return area;
    }

    public double calculateDiagLength(double length) {
        double diagonalLength = length * 1.414;
        return diagonalLength;
    }

}
