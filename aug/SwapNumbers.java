package com.aug;

public class SwapNumbers {
	public static void main (String [] args) {
	
	int a = 20;
	int b = 10;
	System.out.println("The number a ="+a+" and b ="+b );

	a = a + b;// 10+20= 30
	b = a - b;//30-10=20
	a = a - b;//30-20=10
	
	System.out.println("after swaping numbers a ="+a+" and b ="+b );

	}

}

// there are other methods like temp storag, xor, divison .
