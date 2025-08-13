package com.aug;

import java.util.Scanner;

public class IntToBinay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		String binary = Integer.toBinaryString(a);
		System.out.println("Binary numbet is :" + binary);

	}
}
