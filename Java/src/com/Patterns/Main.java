package com.Patterns;

public class Main {
    public static void main(String[] args) {
        int n = 5;
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
//        pattern5(n);
//        pattern6(n);
//        pattern7(n);
//        pattern8(n);
//        pattern9(n);
//        pattern10(n);
//        pattern11(n);
//        pattern12(n); // pending
//        pattern13(n); // pending
        pattern17(n);
//        pattern28(n);
//        pattern30(n);
//        pattern31(n);
    }

    static void pattern1(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    static void pattern2(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int colsInRows = row > n ? 2 * n - row : row;
            for (int col = 0; col < colsInRows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern6(int n) {
        for (int row = 0; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern7(int n) {
        for (int row = 0; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern8(int n) {
        for (int row = 0; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int s = n; s > row; s--) {
                System.out.print(" ");
            }
            for (int col = 0; col <= 2 * row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern9(int n) {
        for (int row = 0; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = 2 * n; col >= 2 * row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern10(int n) {
        for (int row = 0; row < n; row++) {
            int noOfSpaces = n - row;
            for (int s = n; s > row; s--) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern11(int n) {
        for (int row = 0; row < n; row++) {
            int noOfSpaces = n - row;
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = n; col > row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern12(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int colsInRows = row > n ? 2 * n - row - 1 : row;
            int noOfSpaces = n - row;
            for (int s = 0; s < colsInRows; s++) {
                System.out.print(" ");
            }
            for (int col = n; col > colsInRows; col--) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
    }

    static void pattern13(int n) {
        for (int row = 0; row < n; row++) {
            int noOfSpaces = n - row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            int noOfSpaces = n - c;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRows = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRows;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        int orgN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = orgN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

}