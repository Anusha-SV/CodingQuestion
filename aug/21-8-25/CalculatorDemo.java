package com.aug.TwentyOne25;

//Q3: Calculator - Method Overloading
//
//Explanation:
//- Method overloading means same method name but different parameters.
//- Here, add() is overloaded to work with two ints, three ints, and two doubles.

class Calculator {
 // Add two integers
 public int add(int a, int b) {
     return a + b;
 }

 // Add three integers
 public int add(int a, int b, int c) {
     return a + b + c;
 }

 // Add two doubles
 public double add(double a, double b) {
     return a + b;
 }
}

public class CalculatorDemo {
 public static void main(String[] args) {
     Calculator calc = new Calculator();

     System.out.println("Sum of 2 ints = " + calc.add(10, 20));
     System.out.println("Sum of 3 ints = " + calc.add(10, 20, 30));
     System.out.println("Sum of 2 doubles = " + calc.add(5.5, 6.5));
 }
}
