package com.aug;

//Q16: Find Minimum Number of Platforms Required for a Railway Station
//
//Explanation:
//We are given two arrays, `arrival` and `departure` times. We need to find the minimum
//number of platforms required so that no train has to wait.
//The core idea is to find the maximum number of trains present at the station at any given time.
//
//This can be solved by sorting both arrays and then using a two-pointer approach to simulate
//the train traffic.
//

import java.util.Arrays;

public class MinimumPlatforms {
 public static void main(String[] args) {
     int[] arrival = {900, 940, 950, 1100, 1500, 1800};
     int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
     int platforms = findMinPlatforms(arrival, departure);
     System.out.println("Minimum platforms required: " + platforms); // Output: 3
 }

 public static int findMinPlatforms(int[] arrival, int[] departure) {
     Arrays.sort(arrival);
     Arrays.sort(departure);

     int n = arrival.length;
     int platforms = 1;
     int maxPlatforms = 1;
     int arrPtr = 1;
     int depPtr = 0;

     while (arrPtr < n && depPtr < n) {
         if (arrival[arrPtr] <= departure[depPtr]) {
             platforms++;
             arrPtr++;
         } else {
             platforms--;
             depPtr++;
         }
         maxPlatforms = Math.max(maxPlatforms, platforms);
     }
     return maxPlatforms;
 }
}
//Approach (Two Pointers):
//1. Sort both the arrival and departure arrays.
//2. Use two pointers, one for arrival and one for departure.
//3. Iterate through the sorted arrays:
// - If the next arrival time is less than or equal to the current departure time, a new platform is needed. Increment the platform count and the arrival pointer.
// - If the next arrival time is after the current departure time, a platform becomes free. Decrement the platform count and increment the departure pointer.
//4. Keep track of the maximum platform count seen at any point, as this will be the answer.
//
//Example: A={900, 940, 950, 1100, 1500, 1800}, D={910, 1120, 1130, 1200, 1900, 2000}
//- 900 arrives, platforms=1
//- 940 arrives, platforms=2
//- 950 arrives, platforms=3
//- 910 departs, platforms=2
//- 1100 arrives, platforms=3
//
//Time Complexity: O(n log n) due to sorting.
//Space Complexity: O(1)