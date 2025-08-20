package com.aug;

//Q12: Search an Element in a Rotated and Sorted Array
//
//Explanation:
//A rotated sorted array is like [4,5,6,7,0,1,2]. It's sorted, but rotated at some pivot.
//We need to find a target element efficiently.
//

public class SearchRotatedArray {
 public static void main(String[] args) {
     int[] arr = {4, 5, 6, 7, 0, 1, 2};
     int target = 0;

     int index = search(arr, target);
     System.out.println("Target found at index: " + index);
 }

 public static int search(int[] arr, int target) {
     int left = 0, right = arr.length - 1;

     while (left <= right) {
         int mid = (left + right) / 2;

         if (arr[mid] == target) return mid;

         // Left half is sorted
         if (arr[left] <= arr[mid]) {
             if (target >= arr[left] && target < arr[mid])
                 right = mid - 1;
             else
                 left = mid + 1;
         } 
         // Right half is sorted
         else {
             if (target > arr[mid] && target <= arr[right])
                 left = mid + 1;
             else
                 right = mid - 1;
         }
     }

     return -1; // not found
 }
}
//Approach (Modified Binary Search):
//1. Use binary search but with conditions.
//2. Find mid element.
//3. Check which half is sorted (left or right).
//4. If target lies in sorted half → move search there, else go to the other half.
//
//Example: [4,5,6,7,0,1,2], target=0 → Output = index 4
//
//Time Complexity: O(log n)
//Space Complexity: O(1).