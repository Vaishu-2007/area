package com.example;

import junit.framework.TestCase;

public class Circletest extends TestCase {

    public void testCircleArea() {
        double result = circle.calculateArea(5.0);
        assertEquals(78.5398, result, 0.0001);
    }

    public void testZeroRadius() {
        double result = circle.calculateArea(0);
        assertEquals(0.0, result, 0.0001);
    }

    public void testPositiveRadius() {
        double result = circle.calculateArea(2.0);
        assertEquals(12.5663, result, 0.0001);
    }
}