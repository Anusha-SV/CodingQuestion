package com.aug;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principle amount");
		double p = scan.nextDouble();
		System.out.println("Enter time in years");
		double t = scan.nextDouble();
		System.out.println("Enter rate of interest");
		double r = scan.nextDouble();
	double interest = (p * t * r)/100;
	System.out.println("Interest is :"+interest);
	
	}
}
