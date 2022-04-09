package com._05_Recursion.Easy;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(product(10103030));
    }

    static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return product(n / 10) * (n % 10);
    }
}
