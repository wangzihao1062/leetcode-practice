package com.leetcode.array;

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//请注意 ，必须在不复制数组的情况下原地对数组进行操作。

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int right = 0;
        int left = 0;
        while (right < nums.length){
            if(nums[right] != 0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
