package com.leet.code.hashmaps.two_sum_1;

import java.util.HashMap;

public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int seek = target - num;

            if (mp.get(seek) != null) {
                return new int[]{i, mp.get(seek)};
            }
            mp.put(nums[i], i);
        }

        return new int[0];

    }
}
