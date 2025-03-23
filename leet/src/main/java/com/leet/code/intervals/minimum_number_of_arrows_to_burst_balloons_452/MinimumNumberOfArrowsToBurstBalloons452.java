package com.leet.code.intervals.minimum_number_of_arrows_to_burst_balloons_452;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons452 {
    public static int findMinArrowShots(int[][] points) {
        int shoots = 1;

        Arrays.sort(points, Comparator.comparingInt(p -> p[0]));
        int minEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > minEnd) {
                shoots++;
                minEnd = points[i][1];
            } else {
                minEnd = Math.min(minEnd, points[i][1]);
            }
        }

        return shoots;

    }
}