package io.journal.dsa.problems.loops;

import java.util.*;

class JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a += b;
                if (j > 0)
                    System.out.print(" ");
                System.out.print(a);

                b = b * 2;
            }
            System.out.println();
        }
        in.close();
    }
    /*public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 1; j <= n; j++) {
                int value = a + (b * (power(2, j) - 1));
                System.out.print(value + " ");
            }
            System.out.println();
        }

        in.close();
    }
    private static int power(int m, int n) {
        if (n == 0)
            return 1;
        if (n % 2 == 0) {
            return power(m * m, n / 2);
        } else {
            return m * power(m * m, (n - 1) / 2);
        }
    }*/
}
