package com.leet.code.hashmaps.valid_anagram_242;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagram242Test {

    @Test
    public void caseOne() {
        boolean anagram = ValidAnagram242.isAnagram("anagram", "nagaram");
        Assertions.assertTrue(anagram);
    }

    @Test
    public void caseTwo() {
        boolean anagram = ValidAnagram242.isAnagram("rat", "car");
        Assertions.assertFalse(anagram);
    }

}