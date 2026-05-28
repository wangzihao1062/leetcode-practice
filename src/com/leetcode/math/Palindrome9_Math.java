package com.leetcode.math;
//Solution 2:Reverse only the second half of the integer and compare it with the first half.
public class Palindrome9_Math {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int n = 0;
        while(n < x){
            n = n * 10 + x % 10;
            x /= 10;
        }
        return n == x || n / 10 == x ;
    }
}
