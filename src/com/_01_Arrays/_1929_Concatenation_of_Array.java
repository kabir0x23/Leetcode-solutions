package com._01_Arrays;

import java.util.Arrays;

public class _1929_Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println((Arrays.toString(getConcatenation(nums))));
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
