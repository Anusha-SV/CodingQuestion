package com.aug;

//Q11: Find Missing Number in Array (1 to n)
//
//Explanation:
//We are given an array of size n-1 that contains numbers from 1 to n (in any order).
//Only one number is missing. We need to find it.
//

public class MissingNumber {
 public static void main(String[] args) {
     int[] arr = {1, 2, 4, 5};
     int n = 5; // should be max element (or arr.length+1)

     int expectedSum = n * (n + 1) / 2;
     int actualSum = 0;

     for (int num : arr) {
         actualSum += num;
     }

     System.out.println("Missing number = " + (expectedSum - actualSum));
 }
}
//Approach (Sum Formula):
//1. Calculate the expected sum of numbers from 1 to n using formula: n*(n+1)/2.
//2. Calculate the actual sum of the array elements.
//3. The difference = Missing Number.
//
//Example: [1, 2, 4, 5] for n=5
//Expected sum = 15, Actual sum = 12 → Missing = 3
//

