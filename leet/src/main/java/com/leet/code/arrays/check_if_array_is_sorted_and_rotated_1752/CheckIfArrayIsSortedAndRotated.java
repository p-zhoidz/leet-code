package com.leet.code.arrays.check_if_array_is_sorted_and_rotated_1752;

public class CheckIfArrayIsSortedAndRotated {
    public static boolean check(int[] nums) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        int minHeadValue = nums[0];
        boolean rotated = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (rotated) {
                    return false;
                }
                rotated = true;
            }
            if (rotated && nums[i] > minHeadValue) {
                return false;
            }
        }

        return true;

    }
}
