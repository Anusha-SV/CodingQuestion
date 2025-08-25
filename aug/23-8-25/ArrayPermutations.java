package com.aug.TwentyThree;


import java.util.*;

// Q32: Print All Permutations of an Array
//
// Explanation:
// - Use recursion with backtracking to generate permutations.
// - At each step, swap current element with next ones.
// - Recurse for remaining part of array.
// - Backtrack (undo swap) to restore original array.
// - Complexity = O(n!).

public class ArrayPermutations {
    public static void permute(int arr[], int l, int r) {
        if (l == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, r);
            swap(arr, l, i); // backtrack
        }
    }
    
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        permute(arr, 0, arr.length - 1);
    }
}
