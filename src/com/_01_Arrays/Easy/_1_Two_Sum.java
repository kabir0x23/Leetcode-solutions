package com._01_Arrays.Easy;

import java.util.Arrays;

public class _1_Two_Sum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


}
