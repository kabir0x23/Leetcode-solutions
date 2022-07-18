package com._02_Searching;

import java.util.Arrays;

public class _167_Two_Sum_2_ {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[]{++start, ++end};
            }
            else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1, -1};
    }
}
