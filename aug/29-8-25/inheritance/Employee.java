package com.aug.inheritance;

// Child class extending Person (Inheritance example)
public class Employee extends Pers {
    private String designation;

    public Employee(String name, int age, String designation) {
        super(name, age); // calling parent constructor
        this.designation = designation;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // reuse parent method
        System.out.println("Designation: " + designation);
    }
}
