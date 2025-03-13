package com.leet.code.arrays.candy_135;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Candy135Test {

    @Test
    public void caseOne() {
        int sum = Candy135.candy(new int[]{1, 0, 2});
        Assertions.assertEquals(5, sum);
    }

    @Test
    public void caseTwo() {
        int sum = Candy135.candy(new int[]{1, 2, 2});
        Assertions.assertEquals(4, sum);
    }

}