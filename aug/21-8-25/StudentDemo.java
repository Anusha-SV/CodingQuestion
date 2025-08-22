package com.aug.TwentyOne25;

//Q8: Student - Constructor Overloading
//
//Explanation:
//- Multiple constructors allow creating Student with different sets of data.
//- Demonstrates constructor overloading.

class Student {
 String name;
 int rollNo;
 String grade;

 // Only name
 public Student(String name) {
     this.name = name;
 }

 // Name + roll number
 public Student(String name, int rollNo) {
     this.name = name;
     this.rollNo = rollNo;
 }

 // Full details
 public Student(String name, int rollNo, String grade) {
     this.name = name;
     this.rollNo = rollNo;
     this.grade = grade;
 }

 public void display() {
     System.out.println(name + " " + rollNo + " " + grade);
 }
}

public class StudentDemo {
 public static void main(String[] args) {
     Student s1 = new Student("Alice");
     Student s2 = new Student("Bob", 101);
     Student s3 = new Student("Charlie", 102, "A");

     s1.display();
     s2.display();
     s3.display();
 }
}
