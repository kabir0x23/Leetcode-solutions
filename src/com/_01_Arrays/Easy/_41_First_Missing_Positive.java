package com._01_Arrays.Easy;

import java.util.Arrays;

public class _41_First_Missing_Positive {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 0};
        System.out.println(firstMissingPositive(nums1));
        int[] nums2 = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums2));
        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(nums3));
    }

    static int firstMissingPositive(int[] nums) {
        sort(nums);
        int missingNum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (1 < nums[i]){
                    missingNum=1;
                }
                if (nums[i]+1 != nums[j])
                    missingNum = i+1;
            }
        }
        return missingNum;
    }

    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }


}
