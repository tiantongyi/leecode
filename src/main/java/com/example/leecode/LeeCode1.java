package com.example.leecode;

import java.util.HashMap;
import java.util.Map;

public class LeeCode1 {

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            int numi = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                if (numi + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }


    public static int[] twoSumHash(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{i, hashMap.get(target - nums[i])};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
