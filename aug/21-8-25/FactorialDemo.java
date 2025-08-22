package com.aug.TwentyOne25;


//Q9: Factorial - Recursion
//
//Explanation:
//- factorial(n) = n * factorial(n-1).
//- Base case: factorial(0) = 1.

class RecursionDemo {
 public int factorial(int n) {
     if (n == 0) return 1; // base case
     return n * factorial(n - 1); // recursive call
 }
}

public class FactorialDemo {
 public static void main(String[] args) {
     RecursionDemo r = new RecursionDemo();
     int result = r.factorial(5); // 5*4*3*2*1
     System.out.println("Factorial of 5 = " + result);
 }
}