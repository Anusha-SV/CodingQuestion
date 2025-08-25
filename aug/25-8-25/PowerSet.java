package com.aug.TwentyFive;

import java.util.*;

// Q40: Power Set of a Set
//
// Explanation:
// - Use backtracking to explore subsets.
// - Each element has 2 choices: include or exclude.
// - Add each subset to result list.
// - Runs in O(2^n).
// - Classic recursion problem.

public class PowerSet {
    public static void generate(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        // exclude
        generate(arr, index + 1, current, result);
        // include
        current.add(arr[index]);
        generate(arr, index + 1, current, result);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generate(arr, 0, new ArrayList<>(), result);
        System.out.println(result);
    }
}
