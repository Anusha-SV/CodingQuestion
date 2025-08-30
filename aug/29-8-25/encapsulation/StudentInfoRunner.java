package com.aug.encapsulation;

public class StudentInfoRunner {
	public static void main(String[] args) {
		StudentsInfo std = new StudentsInfo("Anusha",6,90.9);
		StudentsInfo std2 = new StudentsInfo("Meow",15,80);
		std.displayGrade();
		std2.displayGrade();

	}
}
