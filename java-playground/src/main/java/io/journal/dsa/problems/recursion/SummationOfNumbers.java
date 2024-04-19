package io.journal.dsa.problems.recursion;

class SummationOfNumbers {

    public static int sumAllRecursive(int num, int acc) {
        if (num == 0) {
            return acc;
        } else {
            return sumAllRecursive(num - 1, acc + num);
        }
    }

    public static int sumAll(int num) {
        if (num == 1)
            return num;
        else
            return num + sumAll(num - 1);
    }

    public static void main(String args[]) {
        int input = 5;
        int sum = sumAllRecursive(input, 0);
        int sum2 = sumAll(input);
        System.out.println("The sum of integers from 1 to " + input + " is: " + sum);
        System.out.println("The sum2 of integers from 1 to " + input + " is: " + sum2);
    }
}