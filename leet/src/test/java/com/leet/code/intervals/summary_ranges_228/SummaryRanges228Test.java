package com.leet.code.intervals.summary_ranges_228;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SummaryRanges228Test {

    @Test
    public void caseOne() {
        List<String> strings = SummaryRanges228.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        Assertions.assertEquals(List.of("0->2", "4->5", "7"), strings);
    }

    @Test
    public void caseTwo() {
        List<String> strings = SummaryRanges228.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});
        Assertions.assertEquals(List.of("0", "2->4", "6", "8->9"), strings);
    }

}