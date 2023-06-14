package io.journal.javatutorials.basics.exercises;


// Practice exercises on Loops.
public class RotatingInsertInArray {

    public static void displayArray(int[] A) {
        for (int x : A)
            System.out.print(x + ",");
        System.out.println();
    }

    public static int[] rotateAnArray(int[] A) {
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;
        return A;
    }

    public static int[] insertElementInArray(int[] A, int numOfElements, int index, int x) {
        for (int i = numOfElements; i > index; i--) {
            A[i] = A[i - 1];
        }
        A[index] = x;
        return A;
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;

        System.out.println("Original Array");
        displayArray(A);

        System.out.println("Rotated Array");
        rotateAnArray(A);
        displayArray(A);

        int numberOfElements = 6;
        int index = 2;
        int x = 20;
        System.out.println("Insert Element " + x + " in Array at index " + index);
        insertElementInArray(A, numberOfElements, index, x);
        displayArray(A);


    }
}
