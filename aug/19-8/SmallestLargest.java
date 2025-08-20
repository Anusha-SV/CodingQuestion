package com.aug;

//Q10: Find Smallest and Largest Element in an Array
//
//Explanation:
//We need to find the smallest (minimum) and largest (maximum) number in the array.
//


public class SmallestLargest {
 public static void main(String[] args) {
     int[] arr = {5, 2, 8, 1, 9};

     int smallest = arr[0];
     int largest = arr[0];

     for (int num : arr) {
         if (num < smallest) smallest = num;
         if (num > largest) largest = num;
     }

     System.out.println("Smallest = " + smallest + ", Largest = " + largest);
 }
}
//Approach:
//1. Assume the first element as both smallest and largest.
//2. Traverse the array one element at a time.
//3. If an element is greater than current largest → update largest.
//4. If an element is smaller than current smallest → update smallest.
//5. At the end, we will have both values.
//
//Example: [5, 2, 8, 1, 9] → Smallest = 1, Largest = 9
//