package org.carla.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    private Fibonacci fibonacci;
    @BeforeEach
    private void setup() { fibonacci = new Fibonacci(); }

    @AfterEach
    private void finish() { fibonacci = null; }

    @Test
    public void testReturnZeroIfTheNumberIsZero() {
        int expectedValue = 0;
        int obtainedValue = fibonacci.fibonacci(0);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void testReturnOneIfTheNumberIsOne() {
        int expectedValue = 1;
        int obtainedValue = fibonacci.fibonacci(1);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void testReturnTwoIfTheNumberIsThree() {
        int expectedValue = 2;
        int obtainedValue = fibonacci.fibonacci(3);
        assertEquals(expectedValue,obtainedValue);
    }
}