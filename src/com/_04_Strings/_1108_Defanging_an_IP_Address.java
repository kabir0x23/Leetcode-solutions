package com._04_Strings;

import java.util.Arrays;

public class _1108_Defanging_an_IP_Address {
    public static void main(String[] args) {
        String address = "KABIR";
        defangIPaddr(address);

        System.out.println(address.toLowerCase());
    }

    static void defangIPaddr(String address) {

        for (int i = 0; i < address.length(); i++) {
            System.out.println(address.charAt(i));
//            if ()
        }
    }
}
