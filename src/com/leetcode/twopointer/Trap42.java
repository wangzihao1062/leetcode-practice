package com.leetcode.twopointer;

//给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。

public class Trap42 {
    public int trap(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int leftMax = 0, rightMax = 0;
            int res = 0;
            while(left < right) {
                if(height[left] < height[right]) {
                    if(height[left] >= leftMax) {
                        leftMax = height[left];
                    } else {
                        res += leftMax - height[left];
                    }
                    left++;
                } else {
                    if(height[right] >= rightMax) {
                        rightMax = height[right];
                    } else {
                        res += rightMax - height[right];
                    }
                    right--;
                }
            }
            return res;
    }
}
