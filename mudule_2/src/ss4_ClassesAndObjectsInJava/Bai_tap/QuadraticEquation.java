package ss4_ClassesAndObjectsInJava.Bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        double delta = Math.pow(this.b, 2.0D) - 4.0D * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        return -this.b + Math.sqrt(this.getDelta()) / (2.0D * this.a);
    }

    public double getRoot2() {
        return -this.b - Math.sqrt(this.getDelta()) / (2.0D * this.a);
    }

    public void equation() {
        if (this.getDelta() > 0.0D) {
            System.out.println("2 equation" + this.getRoot1() + "\n" + this.getRoot2());
        } else if (this.getDelta() == 0.0D) {
            System.out.println("1 equation" + this.getRoot1());
        } else {
            System.out.println("not equation");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a, b, c);
        ptb2.equation();
    }
}
