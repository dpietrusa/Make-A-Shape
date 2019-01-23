package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Circle newCircle = new Circle();
        Square newSquare = new Square();
        Triangle newTriangle = new Triangle();
        Scanner inputScanner = new Scanner(System.in);

        boolean cycle = true;


        while (cycle = true) {

        System.out.println("Welcome to the Make-A-Shape 5000. What kind of shape would you like to make? \n 1 - Circle\n 2 - Square\n 3 - Triangle");
        int shapeChoice = inputScanner.nextInt();

            if (shapeChoice == 1) {
            System.out.println("Great choice! Please enter a radius for your circle.");
            double circleRadius = inputScanner.nextDouble();

            newCircle.setRadius(circleRadius);

            System.out.println("Your circle has the following properties!" + "\nRadius: " + newCircle.getRadius() + "\nDiameter:" + newCircle.calculateDiameter(newCircle.getRadius()) + "\nCircumference:" + newCircle.calculateCircumference(newCircle.getRadius()));
            System.out.println("Make another shape? y/n");
            char anotherShape = inputScanner.next().charAt(0);

                if (anotherShape == 'y' || anotherShape == 'Y') {
                    cycle = true;
                } else {
                } break;


            }
        }
    }
}