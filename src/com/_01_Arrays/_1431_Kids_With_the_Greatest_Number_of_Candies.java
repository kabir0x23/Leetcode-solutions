package com._01_Arrays;

import java.util.*;

public class _1431_Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int max = -1;
        for (int i : candies) {
            max = Math.max(max, i);
        }

        for (int candy : candies) {
            result.add((candy + extraCandies) >= max);
        }
        return result;
    }


}
