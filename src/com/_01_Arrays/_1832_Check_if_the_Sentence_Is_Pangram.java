package com._01_Arrays;

public class _1832_Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram((sentence)));

    }

    static boolean checkIfPangram(String sentence) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < sentence.length(); i++) {

            if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z') {
                index = sentence.charAt(i) - 'A';
            } else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z') {
                index = sentence.charAt(i) - 'a';
            } else continue;
            mark[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return (true);
    }
}
