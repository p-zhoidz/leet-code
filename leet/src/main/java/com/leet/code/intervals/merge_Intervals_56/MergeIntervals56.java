package com.leet.code.intervals.merge_Intervals_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {

    public static int[][] merge(int[][] intervals) {

        List<int[]> resutls = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] start = intervals[0];
        int currentEnd = start[1];

        for (int i = 1; i < intervals.length; i++) {
            if (currentEnd < intervals[i][0]) {
                resutls.add(new int[]{start[0], Math.max(currentEnd, start[1])});
                start = intervals[i];
                currentEnd = intervals[i][1];
            } else {
                currentEnd = Math.max(intervals[i][1], currentEnd);
            }
        }

        resutls.add(new int[]{start[0], Math.max(intervals[intervals.length - 1][1], currentEnd)});


        return resutls.toArray(new int[0][]);

    }

}
