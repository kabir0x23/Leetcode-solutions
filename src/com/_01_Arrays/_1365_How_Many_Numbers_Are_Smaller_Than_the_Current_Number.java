package com._01_Arrays;

import java.util.Arrays;

public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNumber = new int[nums.length];

        for (int i = 0; i < smallerNumber.length; i++) {
            for (int j = 0; j < smallerNumber.length; j++) {
                if(j!=i & nums[j] < nums[i])
                smallerNumber[i]++;
            }
        }
        return smallerNumber;
    }
}
