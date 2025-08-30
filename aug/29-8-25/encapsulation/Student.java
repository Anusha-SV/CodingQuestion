package com.aug.encapsulation;

public class Student {

    private String name;
    private int mark1, mark2, mark3;

    // Constructor
    public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate total
    public int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    // Method to calculate average
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Method to display results
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }
}
