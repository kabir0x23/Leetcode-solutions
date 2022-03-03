package com._04_Strings;

public class _1528_Shuffle_String {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));

    }
    static String restoreString(String s, int[] indices) {

        String[] values = {""};
        for (int i = 0; i < s.length(); i++) {
            values[i] =  indices[i];
        }

    }

}

