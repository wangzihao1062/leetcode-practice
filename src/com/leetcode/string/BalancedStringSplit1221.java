package com.leetcode.string;

//平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
//给你一个平衡字符串 s，请你将它分割成尽可能多的子字符串，并满足：
//每个子字符串都是平衡字符串。
//返回可以通过分割得到的平衡字符串的 最大数量 。

public class BalancedStringSplit1221 {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L'){
                count++;
            }
            if(s.charAt(i) == 'R'){
                count--;
            }
            if(count == 0){
                ans++;
            }
        }
        return ans;
    }
}
