package com._02_Searching.Medium;

public class _287_Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (num == nums[i]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
