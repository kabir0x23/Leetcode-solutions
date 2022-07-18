package com._04_Strings;

import java.util.Arrays;

public class _557_Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String value = Arrays.toString(s.split(", "));
        System.out.println(value);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

//        System.out.println(reverseWords(s));

    }

//    static String reverseWords(String s) {
//        StringBuilder sb = new StringBuilder(s);
//
//        System.out.println(sb);
//        return fasle;
//    }
}
