package com.leet.code.arrays.merge_sorted_arrays_88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArrays88Test {
    @Test
    public void caseOne() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] expected = {1,2,2,3,5,6};

        MergeSortedArrays88.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);
    }

    @Test
    public void caseTwo() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int[] expected = {1};

        MergeSortedArrays88.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);
    }


}