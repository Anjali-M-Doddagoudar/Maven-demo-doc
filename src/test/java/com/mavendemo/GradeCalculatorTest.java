package com.mavendemo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GradeCalculatorTest {

    private GradeCalculator gc;

    @Before
    public void setUp() {
        System.out.println("Setting up GradeCalculator");
        gc = new GradeCalculator();
    }

    @Test
    public void testGradeAPlus() {
        System.out.println("Testing grade A+");
        assertEquals("A+", gc.calculateGrade(95));
    }

    @Test
    public void testGradeA() {
        System.out.println("Testing grade A");
        assertEquals("A", gc.calculateGrade(85));
    }

    @Test
    public void testGradeB() {
        System.out.println("Testing grade B");
        assertEquals("B", gc.calculateGrade(75));
    }

    @Test
    public void testGradeC() {
        System.out.println("Testing grade C");
        assertEquals("C", gc.calculateGrade(65));
    }

    @Test
    public void testGradeD() {
        System.out.println("Testing grade D");
        assertEquals("D", gc.calculateGrade(55));
    }

    @Test
    public void testGradeF() {
        System.out.println("Testing grade F");
        assertEquals("F", gc.calculateGrade(30));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLowMarks() {
        System.out.println("Testing invalid low marks");
        gc.calculateGrade(-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidHighMarks() {
        System.out.println("Testing invalid high marks");
        gc.calculateGrade(110);
    }
}
