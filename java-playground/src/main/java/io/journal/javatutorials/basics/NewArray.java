package io.journal.javatutorials.basics;


/**
 * Declaring arrays
 * Like any other variable, an array must be declared, and its type specified. The type for an array of int values is int[].
 * You can think of the empty brackets as shorthand for the word “array”:
 * <p>
 * int[] myNumbers;
 * <p>
 * This is only a declaration of the variable that will hold the array. The array does not yet exist and so does not have a length.
 * <p>
 * Initializing arrays: shortcut notation
 * We frequently want to give an array some initial values. We have seen the shortcut method already:
 * <p>
 * int[] myNumbers = {10, 15, 20, 25, 30};
 * <p>
 * The shortcut method automatically creates an array of the neccessary length, and initializes the array with the given values.
 * Be careful: the length of myNumbers in the example is now 5, and cannot be increased. Shortcut notation can only be used at the time the array is declared.
 * <p>
 * Initializing arrays with new
 * An array, like a String, is a special type of built-in object. The code
 * <p>
 * int[] myNumbers;
 * <p>
 * declares the variable myNumbers, but does not yet create the array object. The special keyword new in Java is used to create objects, including arrays.
 */

class NewArray {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[5];

        nums[0] = 10;
        nums[1] = 10;
        nums[2] = 10;
        nums[3] = 10;
        nums[4] = 10;

        System.out.println("The array nums has length " + nums.length); // op: The array nums has length 5
        System.out.println("The array nums has values: " + nums); // The array nums has values: [I@14dad5dc

    }

}
