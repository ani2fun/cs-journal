package io.journal.javatutorials.basics;

import java.lang.*;
import java.util.Scanner;

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2);
        System.out.println("Enter number in Binary form: ");
        int x = sc.nextInt();
        System.out.println("Integer form of a number entered: " + x);
    }
}
