package ss4_ClassesAndObjectsInJava.Thuc_hanh;

import java.util.Scanner;

public class RectangleClass {
    double width;
    double height;

    public RectangleClass(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2.0D;
    }

    public String display() {
        return "Rectangle{width = " + this.width + ", height =" + this.height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        RectangleClass rectangle = new RectangleClass(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}
