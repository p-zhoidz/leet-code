package com.leet.code.hashmaps.happy_number_202;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HappyNumber202Test {

    @Test
    public void caseOne() {
        boolean happy = HappyNumber202.isHappy(19);
        Assertions.assertTrue(happy);
    }

    @Test
    public void caseTwo() {
        boolean happy = HappyNumber202.isHappy(2);
        Assertions.assertFalse(happy);
    }

}