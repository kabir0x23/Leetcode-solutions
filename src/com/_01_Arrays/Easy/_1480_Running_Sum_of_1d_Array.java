package com._01_Arrays.Easy;

import java.util.Arrays;

public class _1480_Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));

    }

    static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;
    }
}
