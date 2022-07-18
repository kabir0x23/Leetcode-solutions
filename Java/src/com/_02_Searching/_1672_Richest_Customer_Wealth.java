package com._02_Searching;

public class _1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] i : accounts) {
        int sum = 0;
            for (int j : i) {
                sum += j;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}

