package com.leet.code.arrays.maximum_subarray_53;

public class MaximumSubarray53 {
    public static int maxSubArray(int[] nums) {
        int globalMax = nums[0];
        int localMax = nums[0];


        for(int i=1; i< nums.length; i++) {
            localMax = Math.max(nums[i], localMax+nums[i]);
            globalMax=  Math.max(globalMax, localMax);
        }

        return globalMax;

    }
}
