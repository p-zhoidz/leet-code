package com.leet.code.backtrack.letter_combinations_of_a_phone_number_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber17 {
    private static Map<Character, String> map = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );


    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }
        backTrack(digits, 0, result, new StringBuilder());
        return result;

    }

    private static void backTrack(String digits, int index, List<String> result, StringBuilder builder) {

        if (index >= digits.length()) {
            result.add(builder.toString());
            return;
        }
        String str = map.get(digits.charAt(index));

        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i));

            backTrack(digits, index + 1, result, builder);
            builder.deleteCharAt(builder.toString().length() - 1);
        }
    }
}

