package com._01_Arrays;

import java.util.Arrays;

public class _1470_Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        int j = 0;
        for (int i = 0; i < ans.length; i += 2) {
            ans[i] = nums[j];
            ans[i + 1] = nums[j + n];
            j++;
        }
        return ans;
    }
}
