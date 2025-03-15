package com.leet.code.arrays.trapping_rain_water_42;

public class TrappingRainWater42 {
    public static int trap(int[] height) {

        if(height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length -1;

        int leftMax = 0;
        int rightMax = 0;

        int watterSum = 0;

        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftMax) {
                    leftMax = height[left];
                }else {
                    watterSum+= leftMax - height[left];
                }
                left++;
            } else {
                if(height[right] >= rightMax) {
                    rightMax = height[right];
                }else {
                    watterSum+= rightMax - height[right];
                }
                right--;
            }
        }
        return watterSum;

    }
}
