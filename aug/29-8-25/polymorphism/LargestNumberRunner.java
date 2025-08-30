package com.aug.polymorphism;

/*
Runner class for LargestNumber
Demonstrates method overloading in action
*/
public class LargestNumberRunner {
    public static void main(String[] args) {
        // Create object of LargestNumber
        LargestNumber ln = new LargestNumber();

        // Test with integers
        int intLargest = ln.findLargest(12, 15, 9);
        System.out.println("Largest integer: " + intLargest);

        // Test with doubles
        double doubleLargest = ln.findLargest(12.5, 15.3, 9.8);
        System.out.println("Largest double: " + doubleLargest);
    }
}
