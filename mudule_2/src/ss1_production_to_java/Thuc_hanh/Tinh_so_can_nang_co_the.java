package ss1_production_to_java.Thuc_hanh;

import java.util.Scanner;

public class Tinh_so_can_nang_co_the {
    public Tinh_so_can_nang_co_the() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (in kilogram) :");
        double weight = scanner.nextDouble();
        System.out.print("you height (in meter):");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2.0D);
        System.out.printf("%-20s%s+", "bmi", "Interpretation\n");
        if (bmi < 18.0D) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25.0D) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30.0D) {
            System.out.printf("%-20.2f%s", bmi, "overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "obese");
        }

    }
}
