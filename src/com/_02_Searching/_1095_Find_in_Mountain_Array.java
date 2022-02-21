package com._02_Searching;

public class _1095_Find_in_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(findInMountainArray(arr, target));
    }

    static int findInMountainArray(int[] mountainArr, int target) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = binarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else
            return orderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }


    static int binarySearch(int[] arr, int target, int start, int end) {
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            boolean smallValue = arr[mid - 1] == arr[mid];
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
