package io.journal.javatutorials.basics.exercises;


import java.util.Scanner;

// Simple set of Exercises to practice loops

// 1. Display multiplication table
// 2. Find sum of n numbers
// 3. Factorial of a number
// 4. Display Digits
// 5. Count Digits of a Number
// 6. Finding a number is Armstrong or not
// 7. Reverse a number
// 8. Check a number is palindrome
// 9. Display a number in words even with tailing 0. n = 237, answer: Two Three Seven

public class PracticeLoops1 {
    private static String line = "--------------------------------------";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a task number from following list to run a method/function");
        System.out.println("" +
                "1. Display multiplication table\n" +
                "2. Find sum of n numbers\n" +
                "3. Factorial of a number\n" +
                "4. Display Digits of a number\n" +
                "5. Count Digits of a Number\n" +
                "6. Finding a number is Armstrong or not\n" +
                "7. Reverse a number\n" +
                "8. Check a number is palindrome"
                + "");
        int task = sc.nextInt();
        switch (task) {
            case 1:
                System.out.println(line);
                System.out.println("Enter a number to Display multiplication table");
                displayMultiplicationTable(sc);
                System.out.println(line);
                break;
            case 2:
                System.out.println(line);
                System.out.println("Enter a number to find sum of n numbers");
                find_sumOf_N_Numbers(sc);
                System.out.println(line);
                break;
            case 3:
                System.out.println(line);
                System.out.println("Enter a number to find factorial");
                factorial_of_n(sc);
                System.out.println(line);
                break;
            case 4:
                System.out.println(line);
                System.out.println("Enter a number to display digits of a number");
                display_digits_of_a_number(sc);
                System.out.println(line);
                break;
            case 5:
                System.out.println(line);
                System.out.println("Enter a number to count digits of a number");
                count_digits_of_Number(sc);
                System.out.println(line);
                break;
            case 6:
                System.out.println(line);
                System.out.println("Enter a number to find out if it's Armstrong number.");
                finding_a_number_is_Armstrong_or_not(sc);
                System.out.println(line);
                break;
            case 7:
                System.out.println(line);
                System.out.println("Enter a number to find out it's Reverse number.");
                reverse_a_number(sc);
                System.out.println(line);
                break;
            case 8:
                System.out.println(line);
                System.out.println("Enter a number to find out if it's palindrome number.");
                check_a_number_is_palindrome(sc);
                System.out.println(line);
                break;
            case 9:
                System.out.println(line);
                System.out.println("Enter a number to display it in in words even with tailing 0.");
                display_a_number_in_words(sc);
                System.out.println(line);
                break;
            default:
                System.out.println("Please enter KNOWN task number from above list");
        }
        sc.close();
    }

    private static void displayMultiplicationTable(Scanner sc) {
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // 1+2+3+4+5+..... + n
    private static void find_sumOf_N_Numbers(Scanner sc) {
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(sum + " + " + i + " = ");
            sum = sum + i;
            System.out.print(sum + "\n");
        }
        System.out.println("Final Sum of " + n + " is:" + sum);
    }

    private static void factorial_of_n(Scanner sc) {
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(fact + " * " + i + " = ");
            fact = fact * i;
            System.out.print(fact + "\n");
        }
        System.out.println("Factorial of " + n + "numbers is " + fact);
    }

    private static void display_digits_of_a_number(Scanner sc) {
        int n = sc.nextInt();
        int digit;
        System.out.println("Digits of a number " + n + " are ");
        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            System.out.print(digit + ", ");
        }
    }

    private static void count_digits_of_Number(Scanner sc) {
        int original = sc.nextInt();
        int n = original;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Total digits of a number " + original + " is " + count);
    }

    private static void finding_a_number_is_Armstrong_or_not(Scanner sc) {
        int original = sc.nextInt();
        int n = original;
        int sum = 0;
        int d;
        while (n > 0) {
            d = n % 10;
            sum = sum + (d * d * d);
            n = n / 10;
        }

        if (original == sum) {
            System.out.println("The given number " + original + " is Armstrong number!");
        } else {
            System.out.println("The given number " + original + " is NOT Armstrong number!");
        }
    }

    private static void reverse_a_number(Scanner sc) {
        int original = sc.nextInt();
        int n = original, rev = 0, digit;
        while (n > 0) {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }
        System.out.println("The given numbers " + original + " reverse number is: " + rev);
    }

    private static void check_a_number_is_palindrome(Scanner sc) {
        int original = sc.nextInt();
        int n = original, rev = 0, digit;
        while (n > 0) {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }

        if (rev == original)
            System.out.println("The given number " + original + " is palindrome.");
        else
            System.out.println("The given number " + original + " is NOT palindrome.");
    }

    private static void display_a_number_in_words(Scanner sc) {
        final String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int original = sc.nextInt();
        int n = original;
        int digit;
        System.out.println("The number is in words is: ");
        while (n > 0) {
            digit = n % 10;
            System.out.print(words[digit]);
            n = n /10;
        }

    }


}
