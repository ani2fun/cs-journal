package io.journal.dsa.problems.arrays;

import java.util.Scanner;

public class JavaStdInOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan1.nextDouble();
        String s = scan2.nextLine();

        scan.close();
        scan1.close();
        scan2.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


/*
Sample Input
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
* */