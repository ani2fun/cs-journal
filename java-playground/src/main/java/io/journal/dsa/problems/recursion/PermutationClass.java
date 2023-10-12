package io.journal.dsa.problems.recursion;

public class PermutationClass {
    public static void permutations(char[] array, int length) {
        // Base case
        if (length == 1) {
            System.out.println(array);
            return;
        }

        // recursive case
        for (int i = 0; i < length; i++) {
            swap(array, i, length - 1);
            permutations(array, length - 1);
            swap(array, i, length - 1);
        }
    }

    public static void swap(char[] array, int i, int j) {
        char c = array[i];
        array[i] = array[j];
        array[j] = c;
    }

    public static void main(String args[]) {
        char[] input = {'a', 'b', 'c'};
        System.out.println("Permutations of a string");
        permutations(input, input.length);
    }
}

/**
 * The base case in this method is the if condition-from line 8 to line 11.
 * This if condition simply states that if the length - the length of the input array is equal to 1,
 * it will print the character and return the method.
 * <p>
 * Recursive case#
 * <p>
 * Provided that the length of the array is greater than 1, we move to the recursive case.
 * The first step in the method is to initialize a for loop which starts from 0 until the length of the array.
 * <p>
 * Inside the for loop, the swap method is called which takes in three input arguments;
 * first is the array of characters, second is to keep track of the index and third is the last index of the array.
 * <p>
 * The swap method swaps the values of the current index i with the last index j,
 * which is the length-1 index of array passed from the method above.
 * <p>
 * The recursive call to permutations is made on line 11 with arguments array and length-1.
 * With each successive recursive call, it swaps the values and creates a new array of characters.
 * <p>
 * The swap method is called again on line 17.
 */

/**
 * Recursive case#
 *
 * Provided that the length of the array is greater than 1, we move to the recursive case.
 * The first step in the method is to initialize a for loop which starts from 0 until the length of the array.
 *
 * Inside the for loop, the swap method is called which takes in three input arguments;
 * first is the array of characters, second is to keep track of the index and third is the last index of the array.
 *
 * The swap method swaps the values of the current index i with the last index j,
 * which is the length-1 index of array passed from the method above.
 *
 * The recursive call to permutations is made on line 11 with arguments array and length-1.
 * With each successive recursive call, it swaps the values and creates a new array of characters.
 *
 * The swap method is called again on line 17.
 * */