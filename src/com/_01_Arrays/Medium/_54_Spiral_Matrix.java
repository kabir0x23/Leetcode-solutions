package com._01_Arrays.Medium;

import java.util.*;

public class _54_Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        if (matrix.length == 0) {
            return spiral;
        }

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            // Traverse Right
            for (int j = colStart; j < colEnd; j++) {
                spiral.add(matrix[rowStart][j]);
            }
            rowStart++;

            // Traverse Down
            for (int j = rowStart; j < rowEnd; j++) {
                spiral.add(matrix[j][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colStart; j--) {
                    spiral.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            if (colStart <= colEnd) {
                // Traverse Up
                for (int j = rowEnd; j >= rowStart; j--) {
                    spiral.add(matrix[j][colStart]);
                }
            }
            colStart++;

        }
        return spiral;
    }
}
