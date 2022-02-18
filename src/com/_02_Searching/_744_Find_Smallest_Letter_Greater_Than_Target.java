package com._02_Searching;

public class _744_Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {

        char[] letters = new char[]{'c', 'f', 'j' };
        char target = 'j';
        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
