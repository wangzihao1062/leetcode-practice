package com.leetcode.array;

//输入：accounts = [[1,5],[7,3],[3,5]]
//输出：10
//解释：
//第 1 位客户的资产总量 = 6
//第 2 位客户的资产总量 = 10
//第 3 位客户的资产总量 = 8
//第 2 位客户是最富有的，资产总量是 10

import java.util.Arrays;

public class MaximumWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int[] account : accounts){
            int sum = Arrays.stream(account).sum();
            maxWealth = Math.max(maxWealth,sum);
        }
        return maxWealth;
    }
}
