package com.leet.code.hashmaps.contains_duplicates_219;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicates219Test {

    @Test
    public void caseOne() {
        boolean happy = ContainsDuplicates219.containsNearbyDuplicate(new int[]{1,2,3,1}, 3);
        Assertions.assertTrue(happy);
    }

    @Test
    public void caseTwo() {
        boolean happy = ContainsDuplicates219.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2);
        Assertions.assertFalse(happy);
    }

}