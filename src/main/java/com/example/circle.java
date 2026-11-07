package com.example;

public class circle {

    // Method to calculate area of circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Main method
    public static void main(String[] args) {

        double radius = 5.0;

        double area = calculateArea(radius);

        System.out.println("----- CIRCLE DETAILS -----");
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + area);
        System.out.println("Java Program Executed Successfully!");
    }
}