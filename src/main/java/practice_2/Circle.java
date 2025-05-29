package practice_2;

public class Circle {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The aria is " + area);
    }

    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is " + circumference);
    }
}
