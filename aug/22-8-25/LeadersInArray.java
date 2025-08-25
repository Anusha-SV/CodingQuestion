package com.aug.Twentytwo;


//Q28: Find Leaders in an Array
//
//Explanation:
//- A leader is an element greater than all elements to its right.
//- Traverse array from rightmost side, keep track of max element.
//- If current element >= max, it is a leader.
//- This avoids nested loops, making it O(n).
//- Leaders are useful in array scanning problems.

public class LeadersInArray {
 public static void main(String[] args) {
     int arr[] = {16, 17, 4, 3, 5, 2};
     int n = arr.length;
     int maxFromRight = arr[n-1];
     System.out.print("Leaders: " + maxFromRight + " ");
     
     for (int i = n-2; i >= 0; i--) {
         if (arr[i] >= maxFromRight) {
             maxFromRight = arr[i];
             System.out.print(maxFromRight + " ");
         }
     }
 }
}
