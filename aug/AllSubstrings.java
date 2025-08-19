package com.aug;

//Q7: Find all substrings of a String
public class AllSubstrings {
 public static void main(String[] args) {
     String str = "abc";

     System.out.println("All substrings of " + str + ":");
     for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j <= str.length(); j++) {
             System.out.println(str.substring(i, j));
         }
     }
 }
}
//Approach:
//1. need to generate all possible substrings from the given string.
//2.  can use two nested loops:
// - The outer loop selects the starting index `i`.
// - The inner loop selects the ending index `j`.
//3. For each pair (i, j), we extract substring using `str.substring(i, j)`.
// - Note: substring in Java is exclusive of `j`, so it goes from i → j-1.
//4. Print each substring.
//