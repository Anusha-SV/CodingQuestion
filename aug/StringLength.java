package com.aug;

//Q8: Find length of String without using inbuilt length() method
public class StringLength {
 public static void main(String[] args) {
     String str = "hello";
     int count = 0;

     for (char c : str.toCharArray()) {
         count++;
     }

     System.out.println("Length of \"" + str + "\" = " + count);
 }
}
//Approach:
//1. Convert the string into a character array using `toCharArray()`.
//2. Traverse the array using a loop.
//3. For each character we encounter, increase a counter variable.
//4. At the end, the counter will represent the length of the string.
//