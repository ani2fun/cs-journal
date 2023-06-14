package io.journal.javatutorials.basics.exercises;

import java.util.Scanner;

public class APGPFibSeries {


    public static void APSeries() {
        System.out.println("-- Program to print A.P. Series --");
        System.out.println("Enter a, d and n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("values entered: (a=" + a + ",d=" + d + ",n=" + n + ") ");
        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + ",");
            term = term + d;
        }
        System.out.println();
    }

    public static void GPSeries() {
        System.out.println("-- Program to print G.P. Series --");
        System.out.println("Enter a, r and n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("values entered: (a=" + a + ",r=" + r + ",n=" + n + ") ");
        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + ",");
            term = term * r;
        }
        System.out.println();
    }

    public static void FibonacciSeries() {
        System.out.println("-- Program to print Fibonacci numbers --");
        System.out.println("Enter number of Terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0, second = 1, third;
        System.out.print(first + "," + second + ",");

        for (int i = 0; i < n - 2; i++) {
            third = first + second;
            System.out.print(third + ",");
            first = second;
            second = third;
        }

    }

    public static void main(String[] args) {
        APSeries();
        GPSeries();
        FibonacciSeries();
    }
}
