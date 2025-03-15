package com.leet.code.arrays.trapping_rain_water_42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrappingRainWater42Test {

    @Test
    public void caseOne() {
        int result = TrappingRainWater42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        Assertions.assertEquals(6, result);
    }

    @Test
    public void caseTwo() {
        int result = TrappingRainWater42.trap(new int[]{4, 2, 0, 3, 2, 5});
        Assertions.assertEquals(9, result);
    }

}