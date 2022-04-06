package com._06_Bitwise;

public class _67_Add_Binary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }

    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >=0 || j >= 0) {
            int sum = carry;
            if(i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if(j >= 0) {
                sum += a.charAt(j) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
