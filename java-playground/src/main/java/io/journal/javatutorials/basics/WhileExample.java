package io.journal.javatutorials.basics;

public class WhileExample {
    public static void main(String[] args) {
        int i = 1;                              // initialize a variable
        while (i < 11) {                        // test a condition
            System.out.println(i);
            i++;                                // modify the variable value
        }
        System.out.println("final value of i: " + i);
    }
}