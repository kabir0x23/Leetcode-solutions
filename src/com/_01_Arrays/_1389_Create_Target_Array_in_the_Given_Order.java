package com._01_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _1389_Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            result.add(index[i], nums[i]);
        }

        int[] target = new int[nums.length];
        for (int i = 0; i < result.size(); i++) {
            target[i] = result.get(i);
        }
        return target;
        
    }

}