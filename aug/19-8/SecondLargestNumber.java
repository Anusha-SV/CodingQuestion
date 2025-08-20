package com.aug;

//Q14: Find Second Largest Number in an Array
//
//Explanation:
//We need to find the second-largest value in an array without sorting it.
//This can be done efficiently in a single pass.
//
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25, 12};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest number is: " + secondLargest); // Output: 20
    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
}
// Approach (Single Pass):
// 1. Initialize two variables, 'first' and 'second', to the smallest possible integer value.
// 2. Iterate through the array.
// 3. If the current element is greater than 'first', it becomes the new 'first', and the old 'first' becomes 'second'.
// 4. If the current element is between 'first' and 'second', it becomes the new 'second'.
//
// Example: [10, 5, 20, 8, 25, 12] →
// 1. first=10, second=MIN_VALUE
// 2. first=20, second=10
// 3. first=25, second=20
//
// Time Complexity: O(n)
// Space Complexity: O(1)
