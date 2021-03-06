package com._01_Arrays.Easy;

// link: https://leetcode.com/problems/richest-customer-wealth/
public class _1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(accounts));
    }

    // solution
    static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
