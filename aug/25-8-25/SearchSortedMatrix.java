package com.aug.TwentyFive;

// Q36: Search in a Row-wise and Column-wise Sorted Matrix
//
// Explanation:
// - Matrix rows & columns are sorted in increasing order.
// - Start from top-right corner.
// - If target > current → move down, else move left.
// - Runs in O(m+n).
// - More efficient than O(m*n).

public class SearchSortedMatrix {
    public static boolean search(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int i = 0, j = cols - 1;
        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        System.out.println(search(matrix, 29));
    }
}
