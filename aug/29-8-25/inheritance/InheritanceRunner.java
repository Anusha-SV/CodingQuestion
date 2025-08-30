package com.aug.inheritance;
/*Create a class Person with firstName and lastName as data members. 
 * Override the toString() method to return the full name of the person.
 *  Define constructors to take appropriate parameters.*/
// Runner class
public class InheritanceRunner {
    public static void main(String[] args) {
        Employee emp = new Employee("Anusha", 24, "Software Developer");
        emp.displayInfo();
    }
}
