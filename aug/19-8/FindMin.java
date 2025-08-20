package com.aug;


//Q13: Find Minimum Element in a Sorted and Rotated Array
//
//Explanation:
//Similar to the search problem, a rotated sorted array like [4,5,6,7,0,1,2] has a pivot point.
//The minimum element is the only one smaller than its previous element.
//We can find this efficiently using a modified binary search.
//

public class FindMin {
 public static void main(String[] args) {
     int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
     int[] arr2 = {1, 2, 3, 4, 5};

     System.out.println("Minimum element is: " + findMin(arr1)); // Output: 0
     System.out.println("Minimum element is: " + findMin(arr2)); // Output: 1
 }

 public static int findMin(int[] arr) {
     if (arr == null || arr.length == 0) {
         throw new IllegalArgumentException("Array cannot be empty or null");
     }

     int left = 0, right = arr.length - 1;
     int min = arr[0];

     while (left <= right) {
         // Case 1: If the array is sorted, the minimum is the first element
         if (arr[left] <= arr[right]) {
             min = Math.min(min, arr[left]);
             break;
         }

         int mid = left + (right - left) / 2;
         min = Math.min(min, arr[mid]);

         // Case 2: Left half is sorted, the minimum is in the right half
         if (arr[left] <= arr[mid]) {
             left = mid + 1;
         }
         // Case 3: Right half is sorted, the minimum is in the left half
         else {
             right = mid - 1;
         }
     }
     return min;
 }
}
//Approach (Modified Binary Search):
//1. Initialize left and right pointers.
//2. In each step, check if the left part of the array is sorted (arr[left] <= arr[mid]).
//3. If it is, the minimum must be in the right, so we move left to mid + 1.
//4. If the right part is sorted, the minimum is in the left, so we move right to mid - 1.
//5. Keep track of the minimum element found so far.
//
//Example: [4,5,6,7,0,1,2] → Output = 0
//
//Time Complexity: O(log n)
//Space Complexity: O(1)

