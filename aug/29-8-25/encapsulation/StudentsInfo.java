package com.aug.encapsulation;

/*8. Create a Student class with name, rollNo, and marks as attributes. Write a method to calculate the grade based on the marks and display the grade. Create multiple instances of the Student class and print their grades.*/
public class StudentsInfo {
	private String name;
	private int rollno;
	private double marks;

//constructor
	public StudentsInfo(String name, int rollno, double marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;

	}

// method to calculate grade
	public String caculateGrade() {
		if (marks >= 90) {
			return "A";
		} else if (marks >= 75) {
			return "B";
		} else if (marks >= 65) {
			return "C";
		} else if (marks >= 55) {
			return "D";
		} else {
			return "FAIL";
		}
	}
 // Method to display student information and grade
	public void displayGrade() {
		  System.out.println("Student Name: " + name);
	       System.out.println("Roll Number: " + rollno);
	       System.out.println("Marks: " + marks);
	       System.out.println("Grade: " + caculateGrade());
	       System.out.println("----------------------------");
	}
	
}
