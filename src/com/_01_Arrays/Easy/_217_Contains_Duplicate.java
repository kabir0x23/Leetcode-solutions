package com._01_Arrays.Easy;

public class _217_Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(findDuplicate(nums));
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(findDuplicate(nums2));

    }

    static boolean linearSearch(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    static boolean findDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start - (end + start) / 2;
            if (nums[start] == nums[end]) {
                return true;
            } else if (nums[start] < nums[mid]) {
                end = mid - 1;
            } else
                start = mid + 1;
        }

        return false;
    }
}
