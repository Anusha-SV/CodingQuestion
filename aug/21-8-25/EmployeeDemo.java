package com.aug.TwentyOne25;

// Q2: Employee Management System - Inheritance
//
// Explanation:
// - Person is the parent class containing common attributes (name, age).
// - Employee extends Person, adding new attributes (salary, designation).
// - Employee constructor uses 'super' to call Person constructor.
// - We then display details of Manager and Developer.

class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    double salary;
    String designation;

    // Constructor - uses super() to call Person's constructor
    public Employee(String name, int age, double salary, String designation) {
        super(name, age); // initialize Person fields
        this.salary = salary;
        this.designation = designation;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("-----------------------------");
    }
}

// Test class
public class EmployeeDemo {
    public static void main(String[] args) {
        // Create employees
        Employee e1 = new Employee("Alice", 30, 75000, "Manager");
        Employee e2 = new Employee("Bob", 25, 50000, "Developer");

        // Print details
        e1.displayDetails();
        e2.displayDetails();
    }
}
