package ss6_Inheritance.thuc_hanh;

public class Circle extends Shape {
    private double radius = 1.0D;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.141592653589793D;
    }

    public double getPerimeter() {
        return 2.0D * this.radius * 3.141592653589793D;
    }

    public String toString() {
        return "A Circle with radius =" + this.getRadius() + ", which is a subclass of" + super.toString();
    }
}
