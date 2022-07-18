package com._03_Sorting;

import java.util.Arrays;

public class _268_Missing_Number {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        int n = 4;
        int value = missingNumber(arr);
        System.out.println(value);

    }

    static int missingNumber(int[] arr) {
        cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else i++;
        }
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
