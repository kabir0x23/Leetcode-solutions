package com._01_Arrays;

public class _1572_Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(mat));

        int[][] mat2 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(diagonalSum(mat2));

        int[][] mat3 = {{5}};
        System.out.println(diagonalSum(mat3));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j = mat.length) {
                sum += mat[i][j];
                sum += mat[i][mat.length - 1 - i];
            }
//            for (int j = mat.length-1; j >= 0; j--) {
//                sum += mat[i][j];
//            }

        }
        return sum;
    }

}
