package ss4_ClassesAndObjectsInJava.de_mo;

import java.util.Scanner;

class aqual {
    private double a;
    private double b;
    private double c;

    public aqual(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDetal() {
        double detal = Math.pow(this.b, 2.0D) - 4.0D * this.a * this.c;
        return detal;
    }

    public double getRoot1() {
        return -this.b + Math.sqrt(this.getDetal());
    }

    public double getRoot2() {
        return -this.b - Math.sqrt(this.getDetal());
    }

    public void aquation() {
        if (this.getDetal() > 0.0D) {
            System.out.println("2 equation " + this.getRoot1() + "\n" + this.getRoot2());
        } else if (this.getDetal() == 0.0D) {
            System.out.println("1 equation" + this.getRoot1());
        } else {
            System.out.println("no equation");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a, b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        aqual ptp2 = new aqual(a, b, c);
        ptp2.aquation();
    }
}
