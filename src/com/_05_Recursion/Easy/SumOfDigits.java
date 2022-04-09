package com._05_Recursion.Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(10103030));
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n/10) +( n % 10);
    }
}
