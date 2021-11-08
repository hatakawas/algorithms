package com.example.algorithms.leetcode;

/**
 * Created on Nov 03, 2021.
 *
 * @author hatakawas
 */
public class P1143LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "mnbcdrst";
        String result = new P1143LongestCommonSubsequence().longestCommonSubsequence(s1, s2);
        System.out.println("result=" + result);
    }


    public String longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int maxStart = 0;
        int maxLength = 0;
        int length = 0;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                int idx1 = i;
                int idx2 = j;
                while(idx1 < len1 && idx2 < len2 && text1.charAt(idx1) == text2.charAt(idx2)) {
                    length++;
                    idx1++;
                    idx2++;
                }
                if (length > maxLength) {
                    maxLength = length;
                    maxStart = i;
                } else {
                    length = 0; // 重置公共子串长度
                }
            }
        }
        return text1.substring(maxStart, maxStart + maxLength);
    }
}
