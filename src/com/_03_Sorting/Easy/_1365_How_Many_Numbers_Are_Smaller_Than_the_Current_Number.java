package com._03_Sorting.Easy;

import java.util.Arrays;

public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 56, 7};
        System.out.println(Arrays.toString(nums));
        
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}
