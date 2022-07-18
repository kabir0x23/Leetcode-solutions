package com._05_Recursion.Intro;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 0;
//        System.out.println(fib(n));
        System.out.println(fibFormula(5));

        for (int i  = 0; i <= 5; i++) {
            System.out.println(fibFormula(i));
        }

    }

    static long fibFormula(int n) {
        return (long) (((Math.pow(((1 + Math.sqrt(5)) / 2), n)) - (Math.pow(((1 - Math.sqrt(5)) / 2), n)))/ Math.sqrt(5));
    }

    static int fib(int n) {
        // base condition
        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
