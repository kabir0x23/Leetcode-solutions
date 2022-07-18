package com._05_Recursion.Arrays;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 18, 9};
//        System.out.println(search(arr, 18, 0));
//        System.out.println(searchIndex(arr, 18, 0));
//        System.out.println(searchIndexLast(arr, 18, arr.length - 1));
//        searchAllIndex(arr, 18, 0);
//        System.out.println(list);
//        ArrayList<Integer> ans = searchAllIndex(arr, 18, 0, new ArrayList<>());
//        System.out.println(ans);
        ArrayList<Integer> ans = searchAllIndex2(arr, 18, 0);
        System.out.println(ans);

    }

    static boolean search(int[] arr, int target, int index) {
        // base condition
        if (index == arr.length) {
            return false;
        }

        return target == arr[index] || search(arr, target, index + 1);
    }

    static int searchIndex(int[] arr, int target, int index) {
        // base condition
        if (index == arr.length) {
            return -1;
        }
        if (target == arr[index]) {
            return index;
        } else {

            return searchIndex(arr, target, index + 1);
        }
    }

    static int searchIndexLast(int[] arr, int target, int index) {
        // base condition
        if (index == -1) {
            return -1;
        }
        if (target == arr[index]) {
            return index;
        } else {

            return searchIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void searchAllIndex(int[] arr, int target, int index) {
        // base condition
        if (index == arr.length) {
            return;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        searchAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> searchAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        // base condition
        if (index == arr.length) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        return searchAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> searchAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (target == arr[index]) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = searchAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}