package com._05_Recursion.Intro;

public class NtoOne {
    public static void main(String[] args) {
        int num = 5;
//        reverse(num);
//        funRev(num);
        funBoth(num);
    }

    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        concept(--n);

    }

    static void reverse(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        reverse(num - 1);
    }

    static void funRev(int num) {
        if (num == 0) {
            return;
        }
        funRev(num - 1);
        System.out.println(num);
    }

    static void funBoth(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        funRev(num - 1);
        System.out.println(num);
    }
}
