package com.aug.TwentyOne25;


//Q7: Shape - Polymorphism
//
//Explanation:
//- Parent class Shape has method area().
//- Circle and Rectangle override area() differently.
//- Demonstrates runtime polymorphism.

class Shape {
 public void area() {
     System.out.println("Area of Shape");
 }
}

class Circle extends Shape {
 double radius = 5;
 @Override
 public void area() {
     System.out.println("Area of Circle = " + (Math.PI * radius * radius));
 }
}

class Rectangle extends Shape {
 double length = 10, width = 5;
 @Override
 public void area() {
     System.out.println("Area of Rectangle = " + (length * width));
 }
}

public class ShapeDemo {
 public static void main(String[] args) {
     Shape s1 = new Circle();
     Shape s2 = new Rectangle();

     s1.area();
     s2.area();
 }
}
