package com._02_Searching;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums = {13, 345, 2, 6, 7896, 132465, 1212, 112233};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }


    static boolean even(int num) {
        int digits = digits2(num);
        return digits % 2 == 0;
    }
    static int digits2(int num){
        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

}
