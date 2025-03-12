package com.leet.code.hashmaps.two_sum_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSum1Test {

    @Test
    public void caseOne() {
        int[] ints = TwoSum1.twoSum(new int[]{2, 7, 11, 15}, 9);
        Arrays.sort(ints);
        Assertions.assertArrayEquals(new int[]{0, 1}, ints);
    }

    @Test
    public void caseTwo() {
        int[] ints = TwoSum1.twoSum(new int[]{3, 2, 4}, 6);
        Arrays.sort(ints);
        Assertions.assertArrayEquals(new int[]{1, 2}, ints);
    }

}