package com.aug.polymorphism;
/*
Runner class for calculator
Demonstrates method overloading in action
*/

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));       // Calls add(int, int)
        System.out.println(calc.add(5, 10, 15));   // Calls add(int, int, int)
        System.out.println(calc.add(5.5, 10.2));   // Calls add(double, double)
    }
}
/*Method Overloading is when you have multiple methods in the same class with:

The same method name
Different parameter list (different type, number, or both)
Can have different return types (but return type alone is not enough)

*/