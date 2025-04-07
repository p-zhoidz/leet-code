package com.leet.code.backtrack.generate_parentheses_22;

import com.leet.code.backtrack.letter_combinations_of_a_phone_number_17.LetterCombinationsOfAPhoneNumber17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GenerateParentheses22Test {

    @Test
    public void caseOne() {
        List<String> result = GenerateParentheses22.generateParenthesis(3);
        Assertions.assertEquals(List.of("()()()","()(())","(())()","(()())","((()))"), result);
    }

    @Test
    public void caseTwo() {
        List<String> result = GenerateParentheses22.generateParenthesis(1);
        Assertions.assertEquals(List.of("()"), result);
    }

}