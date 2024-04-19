package io.journal.javatutorials.basics;

/**
 * The array in main (String[] args)
 * You can now see that main takes a single parameter, args, of type String array. How is it used? If you execute a program from the command line (terminal on Unix or Mac), you can pass parameters to the program. For example, the command
 * <p>
 * wc README.txt
 * <p>
 * could be typed into a unix terminal to count the words in README.txt. The first word, wc, is the name of the program to execute. The second word, README.txt, is passed as a string as the first item in the array of strings, args.
 * <p>
 * A similar mechanism is used in C, but since C arrays do not know their lengths, the syntax of the declaration of main is a bit different. In Python, sys.argv can be imported to fetch command-line arguments.
 * <p>
 * The java.util.Arrays class
 * Although arrays in Java are objects, they are built-in, and and as mentioned, are not very flexible.
 * The Arrays class in the java.util package provides some methods that let you do things like sort, binary search, or print a string representation of an array.
 * Unlike some other classes, like Math or String that are available by default,
 * you must request that Java make the Arrays class available to you,
 * using an import statement at the top of any file in which you would like to use it:
 */

import java.util.Arrays;

/**
 * Notice that Arrays.sort works in place.
 * Also notice that there are several overloaded toString methods that work on arrays containing ints, doubles, and even objects.
 * There is no reverse method; you’ll have to write your own or use an ArrayList object to store your list of data.
 */

public class ArraysExample {
    public static void main(String[] args) {
        int[] myNumbers = {42, 1, 17, 27, 16};
        Arrays.sort(myNumbers);
        System.out.println(Arrays.toString(myNumbers));

    }
}
