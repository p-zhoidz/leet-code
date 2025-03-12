package com.leet.code.hashmaps.happy_number_202;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public static boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();

        while (true) {
            if (numbers.contains(n)) {
                return false;
            } else {
                numbers.add(n);
                int sum = 0;
                do {
                    sum += (int) Math.pow(n % 10, 2);
                    n = n / 10;
                } while (n > 0);

                if (sum == 1) {
                    return true;
                }
                numbers.add(n);
                n = sum;
            }
        }
    }

}
