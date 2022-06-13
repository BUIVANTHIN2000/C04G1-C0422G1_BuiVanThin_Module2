package ss5_Access_modifier.bai_tap;

public class Circle {
    private double radius = 1.0D;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2.0D) * 3.141592653589793D;
    }
}