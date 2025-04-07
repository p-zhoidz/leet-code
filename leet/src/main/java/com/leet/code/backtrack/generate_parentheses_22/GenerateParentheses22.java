package com.leet.code.backtrack.generate_parentheses_22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        if (n > 0) {
            backtrack(result, builder, n - 1, n, '(');
        }
        return result;
    }

   static void backtrack(List<String> result, StringBuilder builder, int openNum, int closeNum, char ch) {
        builder.append(ch);

        if (openNum == 0 && closeNum == 0) {
            result.add(builder.toString());
        }

        if (closeNum > 0 && closeNum > openNum) {
            backtrack(result, builder, openNum, closeNum - 1, ')');
        }

        if (openNum > 0 && closeNum > 0) {
            backtrack(result, builder, openNum - 1, closeNum, '(');
        }

        builder.deleteCharAt(builder.toString().length() - 1);
    }

}
