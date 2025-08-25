package com.aug.TwentyThree;

import java.util.*;

// Q33: Rotate an Array by K Positions
//
// Explanation:
// - Rotating means shifting elements by K steps to the right.
// - Use reversal algorithm: reverse three times.
// - Step1: Reverse whole array, Step2: Reverse first K, Step3: Reverse remaining.
// - Time complexity = O(n), space = O(1).
// - Efficient than shifting one by one.

public class RotateArray {
    public static void reverse(int arr[], int l, int r) {
        while (l < r) {
            int temp = arr[l]; arr[l] = arr[r]; arr[r] = temp;
            l++; r--;
        }
    }

    public static void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // handle k > n
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
