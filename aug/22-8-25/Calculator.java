package com.aug.Twentytwo;
/*Create a class Calculator with the following methods:
calculateSum(int number1, int number2) to calculate the sum of two numbers.
calculateDifference(int number1, int number2) to calculate the difference between two numbers.*/

class Calculator {
	public int calculateSum(int num1, int num2) {
		return num1 + num2;
	}

	public int calculateDiff(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.calculateSum(10, 5);
		System.out.println("Sum =" + sum);

		int diff = cal.calculateDiff(10, 5);
		System.out.println("diff=" + diff);

	}
}