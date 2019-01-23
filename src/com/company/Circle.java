package com.company;

public class Circle {

    private double radius;


    public void setRadius(double circleRadius) {
        radius = circleRadius;
    }
    public double getRadius() {
        return radius;
    }


    public double calculateDiameter(double radius) {
        double diameter = radius * 2;
        return diameter;
    }


    public double calculateCircumference(double radius) {
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }






}
