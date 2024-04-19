package io.journal.javatutorials.basics;

import java.util.ArrayList;

public class _2DArray {
    private static String line = "------------------------------";

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 5, 7, 9}}; // int[][] A = new int[3][4];
        System.out.println("A.length: " + A.length);
        System.out.println("A " + A);
        System.out.println("Print the references");
        for (int[] x : A) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println(line);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(line);

        System.out.println("Using For Each loop");
        for (int[] x : A) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println(line);

        System.out.println("Jagged Array or Ragged Array creation");
        System.out.println("" +
                "        int[][] B;\n" +
                "        B = new int[3][];\n" +
                "        B[0] = new int[2];\n" +
                "        B[1] = new int[4];\n" +
                "        B[2] = new int[3];");
        int[][] B;
        B = new int[3][];
        B[0] = new int[2];
        B[1] = new int[4];
        B[2] = new int[3];

        System.out.println("PRINT Jagged array B");
        System.out.println("Using for loop");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(line);
        System.out.println("Using for each loop");
        for (int[] x : B) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println(line);
        System.out.println("Few more examples of defining array");

        int[] D[] = new int[5][5];
        int[] E, F[];
        E = new int[3];
        F = new int[3][3];


    }
}
