package com.aug.encapsulation;

// Class that counts how many objects are created
public class ObjectCounter {

    // Static variable (class-level, shared among all objects)
    private static int objectCount = 0;

    // Constructor increments object count whenever a new object is created
    public ObjectCounter() {
        objectCount++;
    }

    // Method to display number of objects created
    public void display() {
        System.out.println("Number of objects created: " + objectCount);
    }
}
