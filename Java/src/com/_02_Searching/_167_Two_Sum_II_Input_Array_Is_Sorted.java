package com._02_Searching;

import java.util.Arrays;

public class _167_Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

        int[] numbers = {2, 3, 4};
        int target2 = 6;
        int[] result2 = twoSum(numbers, target2);
        System.out.println(Arrays.toString(result2));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int sum = numbers[start] + numbers[end];
            if (target == sum) {
                return new int[]{++start, ++end};
            }
            if (sum < target) {
                start++;
            } else end--;
        }

//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if(target == numbers[i] + numbers[j]) {
//                    return new int[] {++j, ++i};
//                }
//            }
//        }
        return new int[]{-1, -1};
    }

}
