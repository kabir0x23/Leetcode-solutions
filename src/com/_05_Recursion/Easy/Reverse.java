package com._05_Recursion.Easy;

public class Reverse {


    static int sum = 0;

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        fun(n / 10);
    }

    public static void main(String[] args) {
        fun(1842);
        System.out.println(sum);

    }
}
