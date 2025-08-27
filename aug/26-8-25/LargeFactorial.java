package com.aug.Twentysix;

import java.util.*;

// Q47: Factorial of Large Number
//
// Explanation:
// - Factorial grows huge, cannot store in long/int.
// - Store result in ArrayList as digits.
// - Multiply digit by digit for each number.
// - Carry handled manually.
// - Works for very large N.

public class LargeFactorial {
    public static void factorial(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int x = 2; x <= n; x++) {
            int carry = 0;
            for (int i = 0; i < result.size(); i++) {
                int val = result.get(i) * x + carry;
                result.set(i, val % 10);
                carry = val / 10;
            }
            while (carry > 0) {
                result.add(carry % 10);
                carry /= 10;
            }
        }
        Collections.reverse(result);
        for (int digit : result) System.out.print(digit);
        System.out.println();
    }

    public static void main(String[] args) {
        factorial(50);
    }
}
