package com.leetcode.twopointer;

//给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
//同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。

import java.util.*;

public class ThreeSum15 {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) break;
                if (i > 0 && nums[i] == nums[i-1]) continue;
                int l = i + 1;
                int r = nums.length - 1;
                int target = -nums[i];
                while (l < r) {
                    if (nums[l] + nums[r] == target) {
                        result.add(Arrays.asList((nums[l]), nums[r], nums[i]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else if (nums[l] + nums[r] < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
            return result;
        }
    }
