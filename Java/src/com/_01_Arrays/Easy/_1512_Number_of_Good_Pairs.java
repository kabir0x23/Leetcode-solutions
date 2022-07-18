package com._01_Arrays.Easy;

public class _1512_Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        int[] count = new int[100];

        for (int n : nums) {
            goodPairs += count[n]++;
        }

        return goodPairs;

    }
}
