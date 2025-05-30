package practice_3;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;

    void calculateCircleArea(double r) {
        System.out.println(PI * r * r);
    }

    void calculateCircumference(double r) {
        System.out.println(2 * PI * r);
    }
}
