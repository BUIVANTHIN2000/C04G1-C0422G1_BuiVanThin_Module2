package ss6_Inheritance.thuc_hanh;

public class Rectangle extends Shape {
    private double width = 1.0D;
    private double length = 1.0D;

    public Rectangle() {
    }

    public Rectangle(double width, double length, String color, boolean x) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2.0D * this.getArea();
    }

    public String toString() {
        return "A Retangle with width =" + this.getWidth() + " and length=" + this.getLength() + ", which is a subclass of" + super.toString();
    }
}
