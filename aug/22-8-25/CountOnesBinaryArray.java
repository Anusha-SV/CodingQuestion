package com.aug.Twentytwo;


//Q29: Count 1's in Sorted Binary Array
//
//Explanation:
//- Array is sorted, so all 0's appear first, then 1's.
//- We can find the first 1 using binary search.
//- Count = totalLength - indexOfFirstOne.
//- Time complexity = O(log n).
//- Much faster than linear scanning.

public class CountOnesBinaryArray {
 public static int countOnes(int arr[]) {
     int low = 0, high = arr.length - 1, firstOne = -1;
     while (low <= high) {
         int mid = (low + high) / 2;
         if (arr[mid] == 1) {
             firstOne = mid;
             high = mid - 1;  // look left for first occurrence
         } else {
             low = mid + 1;
         }
     }
     return (firstOne == -1) ? 0 : arr.length - firstOne;
 }

 public static void main(String[] args) {
     int arr[] = {0, 0, 0, 1, 1, 1, 1};
     System.out.println("Count of 1's = " + countOnes(arr));
 }
}
