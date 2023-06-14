package io.journal.javatutorials.basics;

/**
 * Conditional operators: >, <, >=, <=, ==, !=
 * Conditional operators work just like they do in most common programming languages. You can compare ints, doubles, and Strings, yielding a true or false value.
 * A very typical coding error is to type = when you meant ==: assigning a value to a variable when you meant to test the value of that variable.
 *
 * Be careful – the Java compiler will not catch this error for you:
 */

public class AssignmentError {
    public static void main(String args[]) {
        int x = 5;
        System.out.println(x);
        System.out.println(x == 5);
        System.out.println(x = 4);
        System.out.println(x);
    }
}