package com.mavendemo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("----- Setting up Calculator -----");
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        System.out.println("Running testAdd()");
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        System.out.println("Running testSubtract()");
        assertEquals(1, calc.subtract(5, 4));
    }

    @Test
    public void testMultiply() {
        System.out.println("Running testMultiply()");
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        System.out.println("Running testDivide()");
        assertEquals(2, calc.divide(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        System.out.println("Running testDivideByZero()");
        calc.divide(10, 0);
    }

    @Test
    public void testIsPositive() {
        System.out.println("Running testIsPositive()");
        assertTrue(calc.isPositive(10));
        assertFalse(calc.isPositive(-5));
    }

    @Test
    public void testIsDivisible() {
        System.out.println("Running testIsDivisible()");
        assertTrue(calc.isDivisible(10, 5));
        assertFalse(calc.isDivisible(10, 3));
    }
}
