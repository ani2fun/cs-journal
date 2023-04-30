package io.journal.tutorials.basics;

/**
 * Arrays in Java, like Python lists, Javascript arrays, and C arrays, store ordered values.
 * Java arrays cannot be resized without creating a new array and making a copy.
 * <p>
 * Java arrays, like C arrays, are more limited than their counterparts in Python or Javascript.
 * Java arrays cannot be resized once created, and you must declare the type of the variables that the array will store in advance.
 * The ArrayList class is more flexible, and a frequent alternative to arrays, but first let’s see how to use arrays.
 * An example of using arrays:
 */

/**
 * Java arrays, like C arrays, are more limited than their counterparts in Python or Javascript.
 * Java arrays cannot be resized once created, and you must declare the type of the variables that the array will store in advance.
 * The ArrayList class is more flexible, and a frequent alternative to arrays, but first let’s see how to use arrays.
 * An example of using arrays:
 * */

/**
 * Notice that although you can determine the length of a string using the method someString.length(),
 * you determine the length of an array using the instance variable someArray.length.
 * May be consider this inconsistency to be a design flaw in Java; people just have to remember it.
 * */

public class ArrayExample {
    public static void main(String[] args) {

        // an array of ints
        int[] myNumbers = {10, 15, 20, 25, 30};

        System.out.println(myNumbers[2]);

        // arrays have an instance variable that stores
        //  the length of the array:
        System.out.println(myNumbers.length);

        // Arrays can be of any type a variable can be:
        String[] myStrings = {"Narnia", "Oz", "Neverland"};
        System.out.println("The Wizard of " + myStrings[1]);

        // arrays can be modified
        myStrings[2] = "Wonderland";
    }
}