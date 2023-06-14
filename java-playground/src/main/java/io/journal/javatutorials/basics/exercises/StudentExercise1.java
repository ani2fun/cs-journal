package io.journal.javatutorials.basics.exercises;

public class StudentExercise1 {
    public static int findSumOfAllElements(int A[]) {
        System.out.println("Sum of All the elements in an Array");
        int sum = 0;
        for (int x : A) {
            sum = sum + x;
        }
        return sum;
    }

    public static int findSecondLargestElement(int A[]) {
        System.out.println("Find Second Largest element in an Array.");
        int max1, max2;
        max1 = max2 = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2) {
                max2 = A[i];
            }
        }
        return max2;
    }

    final static String line = "--------------------------------------";
    public static void main(String[] args) {
        int[] A = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        System.out.println(findSumOfAllElements(A)); // 79
        System.out.println(line);
        System.out.println(findSecondLargestElement(A));
        System.out.println(line);
    }

}
