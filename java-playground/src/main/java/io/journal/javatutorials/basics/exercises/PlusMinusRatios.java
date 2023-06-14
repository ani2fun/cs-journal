package io.journal.javatutorials.basics.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinusRatios {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        final int size = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        if (size > 0) {
            for (int i = 0; i < size ; i++) {

                int digit = arr.get(i);

                if (digit > 0) positiveCount++;
                if (digit < 0) negativeCount++;
                if (digit == 0) zeroCount++;
            }

            double ratioPositive = (double) positiveCount / size;
            double ratioNegative = (double) negativeCount / size;
            double ratioZero = (double) zeroCount / size;

            System.out.printf("%1.6g\n", ratioPositive);
            System.out.printf("%1.6g\n", ratioNegative);
            System.out.printf("%1.6g\n", ratioZero);

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinusRatios.plusMinus(arr);

        bufferedReader.close();
    }
}
