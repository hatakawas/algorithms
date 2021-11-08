package com.example.algorithms;

/**
 * Created on Sep 29, 2021.
 *
 * @author hatakawas
 */
public class MinMaxValue {

    public static void main(String[] args) {
        int[] a = {3, 2, 4, 1};
        int k = 7;
        int result = new MinMaxValue().findMinMaxValue(a, k);
        System.out.println(result);
    }

    private int findMinMaxValue(int[] array, int k) {
        int n = array.length, max = 0, sum = 0;
        for (int x : array) {
            max = Math.max(x, max);
            sum += x;
        }
        return k + sum <= n * max ? max : (k + sum + n - 1) / n;
    }
}
