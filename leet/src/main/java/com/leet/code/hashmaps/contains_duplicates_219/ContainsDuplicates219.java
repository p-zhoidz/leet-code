package com.leet.code.hashmaps.contains_duplicates_219;

import java.util.HashMap;
import java.util.LinkedList;

public class ContainsDuplicates219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        boolean containsDublicates = false;

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new LinkedList<>());
            map.get(nums[i]).add(i);
            LinkedList<Integer> list = map.get(nums[i]);
            if (list.size() > 2) {
                list.pop();
            }
            if (list.size() == 2) {
                if (Math.abs(list.get(0) - list.get(1)) <= k) {
                    containsDublicates = true;
                    break;
                }
            }
        }
        return containsDublicates;

    }
}
