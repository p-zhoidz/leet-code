package com.leet.code.hashmaps.valid_anagram_242;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(int i =0 ; i< s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i = 0; i< t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
        }

        return tMap.equals(sMap);

    }
}
