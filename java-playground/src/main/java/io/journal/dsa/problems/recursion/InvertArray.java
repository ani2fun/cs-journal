package io.journal.dsa.problems.recursion;

public class InvertArray {

    // recursive
    private static void invertRec(int[] array, int currentIndex) {
        if (currentIndex < array.length / 2) {
            // swap array[currentIndex] and array[array.length-1-currentIndex]
            int temp = array[currentIndex];
            array[currentIndex] = array[array.length - 1 - currentIndex];
            array[array.length - 1 - currentIndex] = temp;

            invertRec(array, currentIndex + 1);
        }
    }

    private static void invertIter(int[] arr) {
        int mid = arr.length / 2;
        int tmp = arr.length - 1;
        int tmp2 = 0;
        for (int i = 0; i < mid; i++) {
            tmp2 = arr[i];
            arr[i] = arr[tmp];
            arr[tmp] = tmp2;
            tmp = tmp - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Before: ");

        // initialise array
        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        int[] array = { 2, 1, 6 ,9, 3};

        // printing array
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("} ");

        System.out.println("After: ");

        invertRec(array, 0);
        // OR
        // invertIter(array);

        // printing array
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("} ");
    }
}
