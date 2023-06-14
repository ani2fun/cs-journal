package io.journal.javatutorials.basics;

public class BitwiseSwapping {
    public static void main(String[] args) {

//        Binary to decimal helper (2^n)
//                       .....64 32 16 8 4 2 1

        int a = 9;    // ..... 0  0  0 1 0 0 1
        int b = 12;   // ..... 0  0  0 1 1 0 0

        System.out.println("--------------------------------");
        System.out.println("-- Before Swapping --");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a ^ b;    // ..... 0  0  0 0 1 0 1 = 5
        b = a ^ b;    // ..... 0  0  0 1 0 0 1 = 9
        a = a ^ b;    // ..... 0  0  0 1 1 0 0 = 12
        System.out.println("-- After Swapping --");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("--------------------------------");
    }
}
