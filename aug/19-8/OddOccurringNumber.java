package com.aug;

//Q15: Find the Number Occurring an Odd Number of Times in an Array
//
//Explanation:
//This is a classic problem that can be solved very efficiently using the bitwise XOR operation.
//The XOR operation has the property that `x ^ x = 0` and `x ^ 0 = x`.
//
//If we XOR all elements of the array, all numbers that appear an even number of times will cancel each other out (result in 0),
//leaving only the number that appears an odd number of times.
//

public class OddOccurringNumber {
 public static void main(String[] args) {
     int[] arr = {4, 3, 6, 2, 6, 2, 4, 3, 2, 3, 3}; // The number 2 appears 3 times (odd)
     int oddNum = findOddOccurring(arr);
     System.out.println("The number occurring an odd number of times is: " + oddNum); // Output: 2
 }

 public static int findOddOccurring(int[] arr) {
     int result = 0;
     for (int num : arr) {
         result = result ^ num;
     }
     return result;
 }
}
//Approach (Bitwise XOR):
//1. Initialize a variable 'result' to 0.
//2. Iterate through the array and perform a bitwise XOR with 'result' for each element.
//3. Due to the properties of XOR, pairs of numbers will cancel each other out, leaving the odd one.
//
//Example: {4, 3, 6, 2, 6, 2, 4, 3, 2, 3, 3} →
//result = 0 ^ 4 ^ 3 ^ 6 ^ 2 ^ 6 ^ 2 ^ 4 ^ 3 ^ 2 ^ 3 ^ 3
//result = (4^4) ^ (3^3) ^ (6^6) ^ (2^2) ^ 2 ^ (3^3)
//result = 0 ^ 0 ^ 0 ^ 0 ^ 2 ^ 0 = 2
//
//Time Complexity: O(n)
//Space Complexity: O(1)
