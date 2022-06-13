package ss1_production_to_java.Thuc_hanh;

import java.util.Scanner;

public class Su_dung_toan_tu {
    public Su_dung_toan_tu() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a width");
        float width = scanner.nextFloat();
        System.out.println("Enter a height");
        float height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
