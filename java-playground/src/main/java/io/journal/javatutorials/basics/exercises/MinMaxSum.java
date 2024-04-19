package io.journal.javatutorials.basics.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        final List<Integer> sorted = arr.stream().sorted().toList();
        final int size = arr.size();
        long a = 0;
        for (int i = 1; i <= size - 2; i++) {
            a = a + (long) sorted.get(i);
        }

        long minSum = (long) sorted.get(0) + a;
        long maxSum = (long) sorted.get(size - 1) + a;

        System.out.println(minSum + " " + maxSum);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MinMaxSum.miniMaxSum(arr);

        bufferedReader.close();
        System.exit(0);
    }
}
