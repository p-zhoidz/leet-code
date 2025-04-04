package com.leet.code.backtrack.letter_combinations_of_a_phone_number_17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LetterCombinationsOfAPhoneNumber17Test {


    @Test
    public void caseOne() {
        List<String> result = LetterCombinationsOfAPhoneNumber17.letterCombinations("23");
        Assertions.assertEquals(List.of(
                "ad","ae","af","bd","be","bf","cd","ce","cf"
        ), result);
    }

    @Test
    public void caseTwo() {
        List<String> result = LetterCombinationsOfAPhoneNumber17.letterCombinations("2");
        Assertions.assertEquals(List.of(
                "a","b","c"
        ), result);
    }

}