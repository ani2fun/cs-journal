package io.journal.javatutorials.basics;

public class MatrixMultiplicationAddition {

    private static String line = "----------------------------";

    private static int[][] additionOfTwoMatrices(int[][] A, int[][] B) {
        int[][] C = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    private static int[][] multiplicationOfTwoMatrices(int[][] A, int[][] B) {
        int[][] C = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void display2DMatrix(int[][] A) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void displayTwoMatrix(int[][] A, int[][] B) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void displayThreeMatrix(int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format("%02d ", A[i][j]);
            }
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.format("%02d ", B[i][j]);
            }

            if (i == 1) System.out.print(" =  ");
            else System.out.print("    ");

            for (int j = 0; j < 3; j++) {
                System.out.format("%02d ", C[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] A = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int[][] B = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};

        System.out.println("Display Matrices A, B");
        System.out.println(line);
        displayTwoMatrix(A, B);
        System.out.println(line);

        int[][] C = additionOfTwoMatrices(A, B);
        System.out.println("Addition of A, B ");
        displayThreeMatrix(A, B, C);


        System.out.println("Mulitplication of A, B ");
//        A              B          C
//        03 05 09   01 05 02   60 136 89
//        07 06 02   06 08 04   49 101 52
//        04 03 05   03 09 07   37 89 55
        int[][] D = multiplicationOfTwoMatrices(A, B);
        displayThreeMatrix(A, B, D);


        System.out.println("Mulitplication of A with I (identity matrix) then the result must be A only.");
//        03 05 09   01 00 00     03 05 09
//        07 06 02   00 01 00  =  07 06 02
//        04 03 05   00 00 01     04 03 05
        int[][] I = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] E = multiplicationOfTwoMatrices(A, I);
        displayThreeMatrix(A, I, E);

    }


}
