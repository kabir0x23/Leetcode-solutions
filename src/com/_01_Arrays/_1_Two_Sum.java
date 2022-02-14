package com._01_Arrays;

import java.util.Arrays;

public class _1_Two_Sum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    nums = new int[]{i, j};
                }
            }
        }
        return nums;
    }


}
