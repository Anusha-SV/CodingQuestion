package com.aug;

public class ReverseString {
    public static void main(String[] args) {
        String str = "my name is abc";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + sb.reverse());
    }
}
