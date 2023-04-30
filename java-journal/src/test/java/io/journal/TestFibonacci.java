package io.journal;

import io.journal.tutorials.recursion.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacci {
    @Test
    public void testFibonacci() {
        assertEquals(Fibonacci.fibonacciRecursive(9, 0, 1), 34);
    }
}
