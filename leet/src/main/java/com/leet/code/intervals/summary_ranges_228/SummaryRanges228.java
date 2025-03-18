package com.leet.code.intervals.summary_ranges_228;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int startIndex = -1;

        if(nums == null || nums.length == 0) {
            return result;
        }

        for(int i = 0; i < nums.length; i++) {
            startIndex = i;
            while(i < nums.length -1 && nums[i] + 1 == nums[i+1]) {
                i++;
            }
            if(startIndex == i) {
                result.add(String.valueOf(nums[i]));
            } else {
                result.add(nums[startIndex] + "->" + nums[i]);
            }
        }

        return result;

    }
}
