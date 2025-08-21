package com.aug;

// Q23: Find local minima in array
//
// Explanation:
// A local minima is an element that is smaller than both its neighbors.
//
// Approach:
// 1. Traverse the array.
// 2. If element is smaller than both previous and next → it's a local minima.
// 3. For first element, check only next. For last element, check only previous.
//
// Example: arr={9,6,3,14,5,7,4}
// Local minima = 3, 5, 4
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LocalMinima {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 14, 5, 7, 4};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i == 0 && arr[i] < arr[i + 1]) {
                System.out.println("Local Minima: " + arr[i]);
            } else if (i == n - 1 && arr[i] < arr[i - 1]) {
                System.out.println("Local Minima: " + arr[i]);
            } else if (i > 0 && i < n - 1 && arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                System.out.println("Local Minima: " + arr[i]);
            }
        }
    }
}
