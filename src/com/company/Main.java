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

            System.out.println("Welcome to Make-A-Shape 5000. What kind of shape would you like to make? \n 1 - Circle\n 2 - Square\n 3 - Triangle");
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
                    break;
                }

            } else if (shapeChoice == 2) {
                System.out.println("Great choice! Please enter the side length of your square.");
                double sideLength = inputScanner.nextDouble();

                newSquare.setLength(sideLength);

                System.out.println("Your square has the following properties!" + "\nSide Length: " + newSquare.getLength() + "\nPerimiter:" + newSquare.calculatePerimiter(newSquare.getLength()) + "\nArea:" + newSquare.calculateArea(newSquare.getLength()));
                System.out.println("Make another shape? y/n");
                char anotherShape = inputScanner.next().charAt(0);

                if (anotherShape == 'y' || anotherShape == 'Y') {
                    cycle = true;
                } else {
                    break;
                }


            } else if (shapeChoice == 3) {
                System.out.println("Great choice! Please enter the base of your triangle.");
                double base = inputScanner.nextDouble();

                newTriangle.setBase(base);

                System.out.println("Please enter the height of your triangle.");
                double height = inputScanner.nextDouble();

                newTriangle.setHeight(height);

                System.out.println("Your triangle has the following properties!" + "\nBase: " + newTriangle.getBase() + "\nHeight: " + newTriangle.getHeight() + "\nArea: " + newTriangle.calculateArea(newTriangle.getBase(), newTriangle.getHeight()));
                System.out.println("Make another shape? y/n");
                char anotherShape = inputScanner.next().charAt(0);

                if (anotherShape == 'y' || anotherShape == 'Y') {
                cycle = true;
                } else {
                break;
                }
            }



        }System.out.println("Thank you for using Make-A-Shape 5000. Proudly helping people make shapes since 1988!");
    }
}