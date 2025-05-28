package org.example;

public class MathOperations {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
       if (time == 0) {
           throw new IllegalArgumentException("Время не может быть нулем");
       }

       if (distance < 0) {
           throw new IllegalArgumentException("Дистанция не может быть меньше нуля");
       }
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Значение должно быть больше нуля");
        }
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new IllegalArgumentException("Общая часть не может быть нулем");
        }
        return part * 100/ total;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
