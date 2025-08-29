package com.aug.TwentyEight;

/*
Q3: Create a Circle class with attribute radius.
Provide methods to calculate area and circumference.
*/
class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Area = π * r^2
    double area() {
        return Math.PI * radius * radius;
    }

    // Circumference = 2 * π * r
    double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
