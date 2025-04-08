package com.leet.code.sliding_window.longest_substring_without_repeating_characters3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void caseOne() {
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void caseTwo() {
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void caseThree() {
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
        Assertions.assertEquals(3, result);
    }

}