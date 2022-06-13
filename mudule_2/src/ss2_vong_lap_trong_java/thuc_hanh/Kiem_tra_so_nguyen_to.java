package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Kiem_tra_so_nguyen_to {
    public Kiem_tra_so_nguyen_to() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "is not a prime");
        } else {
            int i = 2;

            boolean check;
            for(check = true; (double)i <= Math.sqrt((double)number); ++i) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }

    }
}
