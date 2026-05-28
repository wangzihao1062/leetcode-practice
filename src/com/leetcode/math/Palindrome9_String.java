package com.leetcode.math;
/*给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。*/
//Solution 1: Judge by reversing the string
public class Palindrome9_String {
    public boolean isPalindrome(int x) {
        String s =String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        return s.contentEquals(sb.reverse());
    }
}


