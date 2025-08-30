package com.aug.encapsulation;
/*Write a program to accept a number and display its last digit in words using a method in a class.
 * Concept: Encapsulation + Utility Method
Classes to create:

LastDigitInWords.java → method displayLastDigitInWords(int)

LastDigitInWordsRunner.java → accept input and call method*/



public class LastDigitInWord {
	// Method to display the last digit in words
	   public void displayLastDigitInWords(int number) {
	     
	       // Extract the last digit
	       int lastDigit = number % 10;

	       // Convert the last digit to words
	       switch (lastDigit) {
	           case 0:
	               System.out.println("Zero");
	               break;
	           case 1:
	               System.out.println("One");
	               break;
	           case 2:
	               System.out.println("Two");
	               break;
	           case 3:
	               System.out.println("Three");
	               break;
	           case 4:
	               System.out.println("Four");
	               break;
	           case 5:
	               System.out.println("Five");
	               break;
	           case 6:
	               System.out.println("Six");
	               break;
	           case 7:
	               System.out.println("Seven");
	               break;
	           case 8:
	              System.out.println("Eight");
	               break;
	         case 9:
	               System.out.println("Nine");
	               break;
	          
	       }
	   }
	

}
