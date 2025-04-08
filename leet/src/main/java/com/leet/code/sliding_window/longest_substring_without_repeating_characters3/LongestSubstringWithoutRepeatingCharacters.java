package com.leet.code.sliding_window.longest_substring_without_repeating_characters3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }

        int result = 0;
        Set<Character> unique = new HashSet<>();

        int left = 0;
        unique.add(s.charAt(left));
        for (int i = 1; i < s.length(); i++) {
            while (unique.contains(s.charAt(i)) && left < s.length()) {
                unique.remove(s.charAt(left));
                left++;
            }
            unique.add(s.charAt(i));
            result = Math.max(result, s.substring(left, i).length() + 1);
        }

        return result;
    }
}
