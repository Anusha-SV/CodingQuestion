package com.aug.TwentyFive;

// Q44: Find Largest Element in Array
//
// Explanation:
// - Initialize max with first element.
// - Traverse the array and compare each element.
// - If current element > max, update max.
// - Time complexity O(n).
// - Very basic but frequently asked.

public class LargestElement {
    public static int findLargest(int arr[]) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {12, 45, 7, 34, 89, 23};
        System.out.println("Largest Element = " + findLargest(arr));
    }
}
