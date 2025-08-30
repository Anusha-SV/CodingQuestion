package com.aug.polymorphism;

class Calculator {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers (overloaded method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles (overloaded method)
    public double add(double a, double b) {
        return a + b;
    }
}
