package com._04_Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b");
        System.out.println((char)('a' + 4));

        System.out.println("a" + 1);
        System.out.println("Kabir" + new ArrayList<>());
        System.out.println(new ArrayList<>() + "" + new Integer(56));
    }
}
