package com.aug.encapsulation;
import java.util.Scanner;


public class LastDigitInWordRunner {
	public static void main(String[] args) {
	     
	       // Create an object of LastDigitInWords
	       LastDigitInWord ldiw = new LastDigitInWord();

	       // Accept the number from the user
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter a number: ");
	       int number = scanner.nextInt();

	       // Call the method to display the last digit in words
	       ldiw.displayLastDigitInWords(number);
	   }
	}

