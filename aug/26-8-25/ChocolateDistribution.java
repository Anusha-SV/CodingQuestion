package com.aug.Twentysix;

import java.util.*;

// Q49: Chocolate Distribution Problem
//
// Explanation:
// - We want min difference between max & min chocolates in a group of m packets.
// - Sort the array first.
// - Check every window of size m.
// - Track minDifference.
// - Runs in O(n log n).

public class ChocolateDistribution {
    public static int findMinDiff(int arr[], int m) {
        Arrays.sort(arr);
        int n = arr.length, minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            minDiff = Math.min(minDiff, arr[i+m-1] - arr[i]);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println("Min Difference = " + findMinDiff(arr, m));
    }
}
