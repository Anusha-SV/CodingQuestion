//Given a Sorted Array and Number x, Find Pair Closest to x
package com.aug;
public class ClosestToX {
    public static void main(String[] args) {
        int arr[] = {10, 22, 28, 29, 30, 40};
        int x = 54;
        int l = 0, r = arr.length - 1;
        int diff = Integer.MAX_VALUE;
        int res1 = 0, res2 = 0;

        // Two-pointer approach
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (Math.abs(sum - x) < diff) {
                res1 = arr[l];
                res2 = arr[r];
                diff = Math.abs(sum - x);
            }

            // If sum is greater than x, decrease right pointer
            if (sum > x) r--;
            else l++;
        }

        System.out.println("Pair closest to " + x + " is: " + res1 + " and " + res2);
    }
}

//Q18: Given a Sorted Array and a Number X, Find the Pair Closest to X
//
//Explanation:
//We have a sorted array and a number X. We need to find the pair whose sum is closest to X.
//
//Approach (Two Pointers):
//1. Initialize two pointers: one at the start (l=0), one at the end (r=n-1).
//2. Compute the sum of arr[l] + arr[r].
//3. If this sum is closer to X than our current best, update the answer.
//4. If the sum > X, move the right pointer left (r--).
// If the sum < X, move the left pointer right (l++).
//5. Continue until l < r.
//
//Example: arr={10,22,28,29,30,40}, X=54
//- (10,40)=50 diff=4
//- (22,30)=52 diff=2  (better)
//- (22,40)=62 diff=8  (worse)
//So answer = (22,30)
//
//Time Complexity: O(n) since we only traverse once.
//Space Complexity: O(1)
