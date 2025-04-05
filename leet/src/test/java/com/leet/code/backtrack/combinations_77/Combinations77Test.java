package com.leet.code.backtrack.combinations_77;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Combinations77Test {

    @Test
    public void caseOne() {
        List<List<Integer>> result = Combinations77.combine(4, 2);
        Assertions.assertEquals(List.of(
                List.of(1, 2),
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 3),
                List.of(2, 4),
                List.of(3, 4)
        ), result);
    }


}