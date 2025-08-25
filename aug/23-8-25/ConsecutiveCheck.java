package com.aug.TwentyThree;


import java.util.*;

// Q31: Check if Array Elements are Consecutive
//
// Explanation:
// - Consecutive means elements form a sequence without gaps.
// - Find min and max in array.
// - If max - min + 1 == n and all unique, then consecutive.
// - Use HashSet to check duplicates.
// - Runs in O(n) time.

public class ConsecutiveCheck {
    public static boolean areConsecutive(int arr[]) {
        int n = arr.length;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        
        if (max - min + 1 != n) return false;
        
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) return false;
            set.add(num);
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 5, 6};
        System.out.println("Are consecutive? " + areConsecutive(arr));
    }
}

