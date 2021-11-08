package com.example.algorithms.leetcode;

/**
 * https://leetcode-cn.com/problems/uncrossed-lines/
 * <p>
 * Created on May 21, 2021.
 *
 * @author hatakawas
 */
public class P1035UncrossedLines {

    public static void main(String[] args) {
//        int[] nums1 = {2, 5, 1, 2, 5};
//        int[] nums2 = {10, 5, 2, 1, 5, 2};
        int[] nums1 = {1, 3, 7, 1, 7, 5};
        int[] nums2 = {1, 9, 2, 5, 1};
        int result = new P1035UncrossedLines().maxUncrossedLines(nums1, nums2);
        System.out.println("result=" + result);
    }

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int k = 0, count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = k; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    k = j + 1;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
