package io.journal.javatutorials.basics;

/**
 * Arrays in Java, like Python lists, Javascript arrays, and C arrays, store ordered values.
 * Java arrays cannot be resized without creating a new array and making a copy.
 * <p>
 * Java arrays, like C arrays, are more limited than their counterparts in Python or Javascript.
 * Java arrays cannot be resized once created, and you must declare the type of the variables that the array will store in advance.
 * The ArrayList class is more flexible, and a frequent alternative to arrays, but first let’s see how to use arrays.
 * An example of using arrays:
 * <p>
 * Java arrays, like C arrays, are more limited than their counterparts in Python or Javascript.
 * Java arrays cannot be resized once created, and you must declare the type of the variables that the array will store in advance.
 * The ArrayList class is more flexible, and a frequent alternative to arrays, but first let’s see how to use arrays.
 * An example of using arrays:
 * <p>
 * Java arrays, like C arrays, are more limited than their counterparts in Python or Javascript.
 * Java arrays cannot be resized once created, and you must declare the type of the variables that the array will store in advance.
 * The ArrayList class is more flexible, and a frequent alternative to arrays, but first let’s see how to use arrays.
 * An example of using arrays:
 * <p>
 * Java arrays, like C arrays, are more limited than their counterparts in Python or Javascript.
 * Java arrays cannot be resized once created, and you must declare the type of the variables that the array will store in advance.
 * The ArrayList class is more flexible, and a frequent alternative to arrays, but first let’s see how to use arrays.
 * An example of using arrays:
 * <p>
 * Java arrays, like C arrays, are more limited than their counterparts in Python or Javascript.
 * Java arrays cannot be resized once created, and you must declare the type of the variables that the array will store in advance.
 * The ArrayList class is more flexible, and a frequent alternative to arrays, but first let’s see how to use arrays.
 * An example of using arrays:
 * <p>
 * Java arrays, like C arrays, are more limited than their counterparts in Python or Javascript.
 * Java arrays cannot be resized once created, and you must declare the type of the variables that the array will store in advance.
 * The ArrayList class is more flexible, and a frequent alternative to arrays, but first let’s see how to use arrays.
 * An example of using arrays:
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
        int A[] = new int[10];

        float B[] = {1, 2, 3, 4, 5};

        int C[];
        C = new int[10];

        System.out.println("Length of an array A[]: " + A.length);
        System.out.println("Length of an array B[]: " + B.length);
        System.out.println("Length of an array C[]: " + C.length);

        System.out.println("Print Array A[]");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Print Array B[]");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        for (float x : B) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Print Array C[]");

    }
}