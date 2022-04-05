package com._01_Arrays.Easy;

import java.util.Arrays;

public class _66_Plus_One {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits)));

        int[] digit2 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(plusOne(digit2)));

        int[] digits3 = {9};
        System.out.println(Arrays.toString(plusOne(digits3)));

        int[] digits5 = {9, 9};
        System.out.println(Arrays.toString(plusOne(digits5)));

        int[] digits4 = {1};
        System.out.println(Arrays.toString(plusOne(digits4)));
    }

    static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
            if (digits[0] == 0) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                return result;
            }
            return digits;
        }
        return digits;
    }
}