package io.journal.dsa.tutorials.javadocdemo;

import java.util.*;

public class JavaDocDemo {
    public static void main(String[] args) {

        printItems(10);

    }

    private static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
