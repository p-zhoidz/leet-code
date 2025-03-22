package com.leet.code.intervals.merge_Intervals_56;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeIntervals56Test {


    @Test
    public void caseOne() {
        int[][] result = MergeIntervals56.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        Assertions.assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, result);
    }

    @Test
    public void caseTwo() {
        int[][] result = MergeIntervals56.merge(new int[][]{{1, 4}, {4, 5}});
        Assertions.assertArrayEquals(new int[][]{{1, 5}}, result);
    }

}