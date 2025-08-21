//Find a Pair Whose Sum is Closest to Zero in Array
package com.aug;

public class ClosestToZero {
    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        int n = arr.length;

        int minSum = Integer.MAX_VALUE;  // store minimum sum
        int pair1 = 0, pair2 = 0;        // store pair

        // Brute force approach: check all pairs
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                // check absolute value since we want closest to 0
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    pair1 = arr[i];
                    pair2 = arr[j];
                }
            }
        }

        System.out.println("The pair whose sum is closest to zero is: " + pair1 + " and " + pair2);
    }
}
//
//Explanation:
//We are given an array of integers. We need to find the two numbers in the array
//whose sum is closest to zero (could be negative, positive, or exactly zero).
//
//Approach:
//1. Use a brute force method: check all pairs in the array.
//2. For each pair, calculate their sum.
//3. Track the pair that has the minimum absolute sum.
//4. Print the pair as the result.
//
//Example: arr = {1, 60, -10, 70, -80, 85}
//Pairs: (1,60=61), (1,-10=-9), (1,70=71), ...
//Closest sum to zero is -9 with pair (1,-10), but better is 5 with (-80,85).
//
//Time Complexity: O(n^2) since we check all pairs.
//Space Complexity: O(1)
