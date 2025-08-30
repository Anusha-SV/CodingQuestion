package com.aug.polymorphism;

/*
LargestNumber class demonstrates Method Overloading
It has two methods 'findLargest' for int and double numbers
*/
public class LargestNumber {

    // Method to find the largest of three integers
    public int findLargest(int a, int b, int c) {
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        return largest;
    }

    // Overloaded method to find the largest of three doubles
    public double findLargest(double a, double b, double c) {
        double largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        return largest;
    }
}
