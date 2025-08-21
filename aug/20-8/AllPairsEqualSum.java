package com.aug;

import java.util.*;

// Q19: Find all pairs of elements from an array whose sum is equal to given number
//
// Explanation:
// Given an array and a target sum, we need to find all pairs that add up to this sum.
//
// Approach (HashSet):
// 1. Traverse array.
// 2. For each number, calculate complement = sum - num.
// 3. If complement already exists in HashSet, we found a pair.
// 4. Store number in HashSet.
//
// Example: arr={1,5,7,-1,5}, sum=6
// Pairs: (1,5), (7,-1), (5,1)
//
// Time Complexity: O(n)
// Space Complexity: O(n)

public class AllPairsEqualSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = sum - num;

            if (set.contains(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            set.add(num);
        }
    }
}
