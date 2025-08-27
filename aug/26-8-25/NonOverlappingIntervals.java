package com.aug.Twentysix;

import java.util.*;

// Q52: Non-overlapping Intervals
//
// Explanation:
// - Sort by end time to minimize removals.
// - Count non-overlapping intervals with greedy approach.
// - Removals = total - non-overlapping.
// - Time complexity O(n log n).
// - Used in interval scheduling.

public class NonOverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0, end = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                count++;
                end = interval[1];
            }
        }
        return intervals.length - count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println("Min Removals = " + eraseOverlapIntervals(intervals));
    }
}
