package com._05_Recursion.Intro;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 2300) {
            System.out.println(n);
         return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
