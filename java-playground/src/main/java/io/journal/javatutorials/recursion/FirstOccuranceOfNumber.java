package io.journal.javatutorials.recursion;

// recursive way
public class FirstOccuranceOfNumber {

    private static int firstOccurrence(int[] array, int num, int currentIndex) {
        if (array.length == currentIndex) {
            return -1;
        } else if (array[currentIndex] == num) {
            return currentIndex;
        } else {
            return firstOccurrence(array, num, currentIndex + 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("{ ");

        int[] array = {2, 3, 4, 1, 7, 8, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");

        int num = 3;

        int result = firstOccurrence(array, num, 0);
        System.out.println("The first occurrence of the number " + num + " is at index: " + result);
    }
}
