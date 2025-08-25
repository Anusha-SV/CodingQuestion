package com.aug.TwentyFive;

// Q45: Check if String is Palindrome
//
// Explanation:
// - Palindrome reads same forward and backward.
// - Compare characters from both ends moving inward.
// - If mismatch found, not palindrome.
// - Time complexity O(n).
// - Common beginner string problem.

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is Palindrome? " + isPalindrome(str));
    }
}
