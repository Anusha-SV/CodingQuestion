package com.aug;

import java.util.*;

// Q21: Separate odd and even numbers in an array
//
// Explanation:
// We want all even numbers at the beginning and odd numbers at the end.
//
// Approach (Two Pointers):
// 1. Place left pointer at start, right pointer at end.
// 2. If left is even, move left forward.
// 3. If right is odd, move right backward.
// 4. Else swap left and right values.
// 5. Continue until left >= right.
//
// Example: arr={12,17,70,15,22}
// Result={12,70,22,15,17}
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SeperateEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) left++;
            while (arr[right] % 2 == 1 && left < right) right--;

            if (left < right) {
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
