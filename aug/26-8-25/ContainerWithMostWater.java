package com.aug.Twentysix;

// Q46: Container With Most Water
//
// Explanation:
// - We need two lines forming max area (width * min(height)).
// - Use two-pointer technique (left, right).
// - Move the smaller height pointer inward.
// - Keep track of maxArea during traversal.
// - Time complexity O(n).

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1, maxArea = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            maxArea = Math.max(maxArea, area);
            if (height[l] < height[r]) l++;
            else r--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max Area = " + maxArea(arr));
    }
}
