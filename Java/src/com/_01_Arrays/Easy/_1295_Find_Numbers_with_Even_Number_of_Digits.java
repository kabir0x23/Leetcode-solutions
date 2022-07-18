package com._01_Arrays.Easy;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        int[] nums2 = {437, 315, 322, 431, 686, 264, 442};
        System.out.println(findNumbers(nums2));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (evenNum(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean evenNum(int num) {
        int digit = digits(num);
        return digit % 2 == 0;
    }

    static int digits(int num) {
//        int count = 0;
//        while (num > 0) {
//            num = num / 10;
//            count++;
//        }
//        return count;
//
//              or
    return (int)(Math.log10(num)) + 1;
    }
}
