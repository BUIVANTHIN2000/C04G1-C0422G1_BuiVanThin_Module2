package ss1_production_to_java.Bai_tap;

import java.util.Scanner;

public class Ung_dung_doc_so_thanh_chu {
    public Ung_dung_doc_so_thanh_chu() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("số cần đọc");
        int number = sc.nextInt();
        int a = number % 10;
        int b = number / 10 % 10;
        int c = number / 100;
        int d = number % 100;
        switch(d) {
            case 11:
                System.out.print("eleven ");
                break;
            case 12:
                System.out.print("twenty ");
                break;
            case 13:
                System.out.print("three ");
                break;
            case 14:
                System.out.print("four ");
                break;
            case 15:
                System.out.print("five ");
                break;
            case 16:
                System.out.print("six ");
                break;
            case 17:
                System.out.print("seven ");
                break;
            case 18:
                System.out.print("eight ");
                break;
            case 19:
                System.out.print("nine ");
        }

        switch(c) {
            case 1:
                System.out.print("One hundred ");
                break;
            case 2:
                System.out.print("Two hundred ");
                break;
            case 3:
                System.out.print("Three hundred ");
                break;
            case 4:
                System.out.print("Four hundred ");
                break;
            case 5:
                System.out.print("Five hundred ");
                break;
            case 6:
                System.out.print("Six hundred ");
                break;
            case 7:
                System.out.print("Seven hundred ");
                break;
            case 8:
                System.out.print("Eight hundred ");
                break;
            case 9:
                System.out.print("Nine hundred ");
        }

        if (b % 10 == 0 && a != 0) {
            System.out.print(" ");
        }

        switch(b) {
            case 1:
                System.out.print("ten ");
                break;
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
        }

        switch(a) {
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
        }

    }
}