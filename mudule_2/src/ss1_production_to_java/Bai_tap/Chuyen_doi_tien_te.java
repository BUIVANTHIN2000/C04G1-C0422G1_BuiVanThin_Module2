package ss1_production_to_java.Bai_tap;

import java.util.Scanner;

public class Chuyen_doi_tien_te {
    public Chuyen_doi_tien_te() {
    }

    public static void main(String[] args) {
        double VND = 23000.0D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cần chuyển");
        double usd = sc.nextDouble();
        double quydoi = usd * 23000.0D;
        System.out.println("sau quy đổi :" + quydoi);
    }
}