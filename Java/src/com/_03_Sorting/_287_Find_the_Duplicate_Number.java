package com._03_Sorting;


import java.util.Arrays;

public class _287_Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(Arrays.toString(new int[]{findDuplicate(arr)}));

    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
