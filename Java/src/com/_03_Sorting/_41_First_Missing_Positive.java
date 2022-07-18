package com._03_Sorting;

import java.util.Arrays;

public class _41_First_Missing_Positive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
