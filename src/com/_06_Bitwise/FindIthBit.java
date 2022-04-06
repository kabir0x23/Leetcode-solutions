package com._06_Bitwise;

public class FindIthBit {
    public static void main(String[] args) {
        int num = 116;
        int n = 5;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toString(10110110));
        System.out.println(Integer.toBinaryString(findBit(num, n)));

    }

    static int findBit(int num, int n){
        return num & (1 << (n-1));

    }
}
