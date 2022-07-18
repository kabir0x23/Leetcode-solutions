package com._01_Arrays.Medium;

import java.util.Arrays;

public class _73_Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
//                {0, 1, 2, 0},
//                {3, 4, 5, 2},
//                {1, 3, 1, 5}
        };

        System.out.println(Arrays.deepToString(setZeroes(matrix)));
    }

    static int[][] setZeroes(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    for (int i = 0; i < matrix[0].length; i++) {
                        matrix[row][col--] = -1;
                    }
                }
            }
        }
        return matrix;
    }
}
