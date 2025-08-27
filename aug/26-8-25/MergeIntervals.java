package com.aug.Twentysix;

import java.util.*;

// Q51: Merge Overlapping Intervals
//
// Explanation:
// - Sort intervals by start.
// - Compare with last added interval.
// - Merge if overlapping, else add new one.
// - Time complexity O(n log n).
// - Classic greedy problem.

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = merge(intervals);
        for (int[] in : res) System.out.println(Arrays.toString(in));
    }
}
