package com.aug.TwentyThree;


import java.util.*;

// Q30: Find First Repeating Element
//
// Explanation:
// - We must return the first element that repeats in array.
// - Use HashSet to track visited elements.
// - If element already exists, that is the repeating one.
// - This works in O(n) time.
// - Good problem for hash-based searching.

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        Set<Integer> set = new HashSet<>();
        int firstRepeat = -1;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) firstRepeat = arr[i];
            else set.add(arr[i]);
        }
        
        System.out.println("First Repeating Element: " + firstRepeat);
    }
}
