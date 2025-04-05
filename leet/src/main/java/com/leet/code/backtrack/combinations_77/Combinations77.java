package com.leet.code.backtrack.combinations_77;

import java.util.ArrayList;
import java.util.List;

class Combinations77 {

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCycle = new ArrayList<>();

        backtrack(1, n, k, currentCycle, result);
        return result;
    }

    static void backtrack(int start, int n, int k, List<Integer> currentCycle, List<List<Integer>> result) {
        if (currentCycle.size() == k) {
            result.add(new ArrayList<>(currentCycle));
            return;
        }

        for (int num = start; num <= n; num++) {
            currentCycle.add(num);
            backtrack(num + 1, n, k, currentCycle, result);
            currentCycle.remove(currentCycle.size() - 1);
        }

    }

}
