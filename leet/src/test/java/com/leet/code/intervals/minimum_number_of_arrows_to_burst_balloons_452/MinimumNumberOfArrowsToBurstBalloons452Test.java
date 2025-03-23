package com.leet.code.intervals.minimum_number_of_arrows_to_burst_balloons_452;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumNumberOfArrowsToBurstBalloons452Test {

    @Test
    public void caseOne() {
        int minArrowShots = MinimumNumberOfArrowsToBurstBalloons452
                .findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}});
        Assertions.assertEquals(2, minArrowShots);
    }

    @Test
    public void caseTwo() {
        int minArrowShots = MinimumNumberOfArrowsToBurstBalloons452
                .findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}});
        Assertions.assertEquals(4, minArrowShots);
    }

}