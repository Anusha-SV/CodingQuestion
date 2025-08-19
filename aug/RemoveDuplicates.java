package com.aug;

//: Write a program to remove duplicates from an array.
import java.util.*;

public class RemoveDuplicates {
 public static void main(String[] args) {
     int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};
     Set<Integer> set = new LinkedHashSet<>();
     for (int n : arr) {
         set.add(n);
     }
     System.out.println("Array without duplicates = " + set);
 }
}
/*START
SET arr = [1, 2, 3, 2, 4, 1, 5, 3]
CREATE empty set
FOR each element in arr DO
    ADD element to set
END FOR
PRINT set
END
*/