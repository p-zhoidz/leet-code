package com.leet.code.arrays.check_if_array_is_sorted_and_rotated_1752;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfArrayIsSortedAndRotatedTest {

    @Test
    public void caseOne() {
        int[] array = {3, 4, 5, 1, 2};

        boolean result = CheckIfArrayIsSortedAndRotated.check(array);
        assertTrue(result);
    }


    @Test
    public void caseTwo() {
        int[] array = {2, 1, 3, 4};

        boolean result = CheckIfArrayIsSortedAndRotated.check(array);
        assertFalse(result);
    }

}