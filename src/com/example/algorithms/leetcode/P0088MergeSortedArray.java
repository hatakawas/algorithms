package com.example.algorithms.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on Nov 04, 2021.
 *
 * @author hatakawas
 */
public class P0088MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        new P0088MergeSortedArray().merge(nums1, m, nums2, n);
        List<Integer> list = new ArrayList<>();
        Arrays.stream(nums1).forEach(list::add);
        System.out.println(list);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-- + n-- - 1;
        while (n >= 0) {
            nums1[i--] = m >= 0 && nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
    }
}
