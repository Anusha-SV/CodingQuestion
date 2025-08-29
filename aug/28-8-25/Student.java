package com.aug.TwentyEight;

/*
Q1: Create a Student class with attributes: name, age, grade.
Provide a method to display student details.
*/
class Student {
    String name;
    int age;
    char grade;

    // Constructor to initialize Student object
    Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student("Anusha", 21, 'A');
        Student s2 = new Student("Rahul", 22, 'B');

        s1.displayDetails();
        s2.displayDetails();
    }
}
