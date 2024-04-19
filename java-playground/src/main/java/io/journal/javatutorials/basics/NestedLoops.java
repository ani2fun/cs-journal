package io.journal.javatutorials.basics;

public class NestedLoops {
    public static void printColumns() {
        System.out.println("Print Columns");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void printRows() {
        System.out.println("Print Rows");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void printRowAndColumn() {
        System.out.println("Print Rows And Columns");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }
    }

    private static void printCount() {
        int count = 0;
        System.out.println("Print count");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println();
        }
    }

    private static void printLowerTriangle() {
        System.out.println("Print Lower triangle");
        for (int row = 1; row <= 5; row++) {
            for (int j = 1; j <= row; j++) {
                System.out.format("%02d ", j);
            }
            System.out.println();
        }
    }

    private static void printLowerTriangleCounts() {
        int count = 0;
        System.out.println("Print Lower triangle Counts");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println();
        }
    }

    private static void printUpperLeftTriangleWithColumn() {
        /**
         * 01 02 03 04 05
         * 01 02 03 04
         * 01 02 03
         * 01 02
         * 01
         */
        System.out.println("Print Upper Left triangle with column number");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5 - row + 1; col++) {
                System.out.format("%02d ", col);
            }
            System.out.println();
        }
    }

    private static void printUpperRightTriangleWithAsterix() {
        System.out.println("Print Upper Right triangle with Asterix");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row <= col)
                    System.out.print("* ");
                else
                    System.out.print("  "); // two blank spaces
            }
            System.out.println();
        }
    }

    private static void printUpperRightTriangleWithAsterixOneLess() {
        System.out.println("Print Upper Right triangle with  but one less Asterix in each row");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if ((row + 1) <= col)
                    System.out.print("* ");
                else
                    System.out.print("  "); // two blank spaces
            }
            System.out.println();
        }
    }

    private static void printLowerRightTriangleWithAsterix() {
        System.out.println("Print Lower Right triangle with Asterix");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row + col > 5) { // if (col > (5 - row)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPyramidPattern() {
        //         *
        //       * * *
        //     * * * * *
        //   * * * * * * *
        // * * * * * * * * *

        System.out.println("Print Pyramid Like Asterix Pattern");

        for (int row = 1; row <= 5; row++) {
            System.out.println();
            for (int col = 1; col <= 5; col++) {
                if (row + col > 5) System.out.print("* ");
                else System.out.print("  ");
            }

            for (int j = 1; j <= row - 1; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    final static String line = "---------------------------";

    public static void main(String[] args) {
        printColumns();
        System.out.println(line);

        printRows();
        System.out.println(line);

        printRowAndColumn();
        System.out.println(line);

        printCount();
        System.out.println(line);

        printLowerTriangle();
        System.out.println(line);

        printLowerTriangleCounts();
        System.out.println(line);

        printUpperLeftTriangleWithColumn();
        System.out.println(line);

        printUpperRightTriangleWithAsterixOneLess();
        System.out.println(line);

        printUpperRightTriangleWithAsterix();
        System.out.println(line);

        printLowerRightTriangleWithAsterix();
        System.out.println(line);

        printPyramidPattern();
        System.out.println(line);

    }

}
