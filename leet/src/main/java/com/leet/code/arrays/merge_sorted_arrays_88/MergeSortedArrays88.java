package com.leet.code.arrays.merge_sorted_arrays_88;

class MergeSortedArrays88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nPointer = m - 1;
        int mPointer = n - 1;
        int position = m + n - 1;
        while (mPointer >= 0) {
            if (nPointer >= 0 && nums1[nPointer] > nums2[mPointer]) {
                nums1[position--] = nums1[nPointer--];
            } else {
                nums1[position--] = nums2[mPointer--];
            }
        }
    }
}
