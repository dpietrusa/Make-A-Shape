package com.company;

public class Triangle {

    private double base;
    private double height;

    public void setBase(double triangleBase) {
        base = triangleBase;
    }
    public double getBase() {
        return base;
    }

    public void setHeight(double triangleHeight) {
        height = triangleHeight;
    }
    public double getHeight() {
        return height;
    }

    public double calculateArea(double base, double height) {
        double area = base * height / 2;
        return area;
    }

}
