// Q3: Write a program to check if two strings are anagrams.
package com.aug;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "apple", s2 = "apply";
        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are Anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams.");
        }
    }

    static boolean areAnagrams(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
/*START
SET s1 = "abc", s2 = "bca"
CONVERT s1 and s2 to character arrays
SORT both arrays
IF sorted arrays are equal THEN
    PRINT "Anagrams"
ELSE
    PRINT "Not Anagrams"
END IF
END
*/