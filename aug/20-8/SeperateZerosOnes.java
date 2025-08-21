package com.aug;

import java.util.*;

// Q20: Given an array of 0’s and 1’s in random order, separate them
//
// Explanation:
// We need to rearrange the array so that all 0’s come first and 1’s come after.
//
// Approach (Two Pointers):
// 1. Start with two pointers: left=0, right=n-1.
// 2. Move left pointer forward if element is 0.
// 3. Move right pointer backward if element is 1.
// 4. If left has 1 and right has 0 → swap them.
// 5. Repeat until left >= right.
//
// Example: arr={0,1,1,0,1,0}
// Result={0,0,0,1,1,1}
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SeperateZerosOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) left++;
            else if (arr[right] == 1) right--;
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Separated Array: " + Arrays.toString(arr));
    }
}
