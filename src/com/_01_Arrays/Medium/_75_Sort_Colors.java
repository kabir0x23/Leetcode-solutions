package com._01_Arrays.Medium;

public class _75_Sort_Colors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println(sortColors(nums));
    }

    static int sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return -1;
    }
}
