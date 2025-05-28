package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {
    @Test
    void testAddPositiveNumbers() {
        int result = MathOperations.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void testAddNegativeNumbers() {
        int result = MathOperations.add(-2, -4);
        assertEquals(-6, result);
    }

    @Test
    void testSubtractPositiveNumbers() {
        int result = MathOperations.subtract(10, 3);
        assertEquals(7, result);
    }

    @Test
    void testSubtractNegativeNumbers() {
        int result = MathOperations.subtract(-5, -2);
        assertEquals(-3, result);
    }

    @Test
    void testMultiplyPositiveNumbers() {
        int result = MathOperations.multiply(4, 5);
        assertEquals(20, result);
    }

    @Test
    void testMultiplyByZero() {
        int result = MathOperations.multiply(7, 0);
        assertEquals(0, result);
    }

    @Test
    void testDivideEvenNumbers() {
        double result = MathOperations.divide(10, 2);
        assertEquals(5.0, result);
    }

    @Test
    void testDivideWithRemainder() {
        double result = MathOperations.divide(7, 2);
        assertEquals(3.5, result);
    }

    @Test
    void testFindMaxFirstNumberGreater() {
        int result = MathOperations.findMax(10, 5);
        assertEquals(10, result);
    }

    @Test
    void testFindMaxSecondNumberGreater() {
        int result = MathOperations.findMax(3, 8);
        assertEquals(8, result);
    }

    @Test
    void testDifferenceFirstNumberGreater() {
        int result = MathOperations.difference(10, 3);
        assertEquals(7, result);
    }

    @Test
    void testDifferenceSecondNumberGreater() {
        int result = MathOperations.difference(2, 9);
        assertEquals(7, result);
    }

    @Test
    void testSquareAreaSmallSide() {
        int result = MathOperations.squareArea(3);
        assertEquals(9, result);
    }

    @Test
    void testSquareAreaLargeSide() {
        int result = MathOperations.squareArea(10);
        assertEquals(100, result);
    }

    @Test
    void testSquarePerimeterSmallSide() {
        int result = MathOperations.squarePerimeter(5);
        assertEquals(20, result);
    }

    @Test
    void testSquarePerimeterLargeSide() {
        int result = MathOperations.squarePerimeter(12);
        assertEquals(48, result);
    }

    @Test
    void testConvertExactMinutes() {
        double result = MathOperations.convertSecondsToMinutes(120);
        assertEquals(2.0, result);
    }

    @Test
    void testConvertWithDecimal() {
        double result = MathOperations.convertSecondsToMinutes(90);
        assertEquals(1.5, result);
    }

    @Test
    void testAverageSpeedThrowsExceptionWhenTimeIsZero() {
        try {
            MathOperations.averageSpeed(100.0, 0.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Время не может быть нулем", e.getMessage());
        }
    }

    @Test
    void testAverageSpeedThrowsExceptionWhenDistanceIsNegative() {
        try {
            MathOperations.averageSpeed(-50.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Дистанция не может быть меньше нуля", e.getMessage());
        }
    }

    @Test
    void testFindHypotenuseValidInput() {
        double result = MathOperations.findHypotenuse(3.0, 4.0);
        assertEquals(5.0, result);
    }

    @Test
    void testFindHypotenuseThrowsExceptionWhenValueIsZeroOrNegative() {
        try {
            MathOperations.findHypotenuse(0.0, 5.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Значение должно быть больше нуля", e.getMessage());
        }
    }

    @Test
    void testCircleCircumferenceSmallRadius() {
        double result = MathOperations.circleCircumference(1.0);
        assertEquals(6.283185307179586, result, 0.000001);
    }

    @Test
    void testCircleCircumferenceLargeRadius() {
        double result = MathOperations.circleCircumference(5.0);
        assertEquals(31.41592653589793, result, 0.000001);
    }

    @Test
    void testCalculatePercentageValidInput() {
        double result = MathOperations.calculatePercentage(200.0, 50.0);
        assertEquals(25.0, result);
    }

    @Test
    void testCalculatePercentageThrowsExceptionWhenTotalIsZero() {
        try {
            MathOperations.calculatePercentage(0.0, 50.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Общая часть не может быть нулем", e.getMessage());
        }
    }

    @Test
    void testCelsiusToFahrenheitZeroDegrees() {
        double result = MathOperations.celsiusToFahrenheit(0.0);
        assertEquals(32.0, result);
    }

    @Test
    void testCelsiusToFahrenheitPositiveDegrees() {
        double result = MathOperations.celsiusToFahrenheit(100.0);
        assertEquals(212.0, result);
    }

    @Test
    void testFahrenheitToCelsiusFreezingPoint() {
        double result = MathOperations.fahrenheitToCelsius(32.0);
        assertEquals(0.0, result);
    }

    @Test
    void testFahrenheitToCelsiusBoilingPoint() {
        double result = MathOperations.fahrenheitToCelsius(212.0);
        assertEquals(100.0, result);
    }

}