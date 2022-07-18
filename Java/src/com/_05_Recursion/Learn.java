package com._05_Recursion;

public class Learn {
    public static void main(String[] args) {
        int n = 5;
//        fun(n);
        System.out.println(factorial(n));
    }


    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }

}
