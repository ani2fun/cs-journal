package io.journal;

import io.journal.javatutorials.recursion.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacci {
    @Test
    public void testFibonacci() {
        assertEquals(34, Fibonacci.fibonacciRecursive(9, 0, 1));
    }
}
