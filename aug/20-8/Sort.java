package com.aug;

import java.util.*;

// Q22: Sort array containing only 0s, 1s, and 2s
//
// Explanation:
// We need to sort the array so that 0s come first, then 1s, then 2s.
// This is also called the Dutch National Flag problem.
//
// Approach (Three Pointers):
// 1. Use three pointers: low, mid, high.
// 2. If arr[mid]==0 → swap arr[low] and arr[mid], increase both.
// 3. If arr[mid]==1 → just move mid forward.
// 4. If arr[mid]==2 → swap arr[mid] and arr[high], decrease high.
// 5. Continue until mid <= high.
//
// Example: arr={0,1,2,0,1,2,1,0}
// Result={0,0,0,1,1,1,2,2}
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Sort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 0};

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
