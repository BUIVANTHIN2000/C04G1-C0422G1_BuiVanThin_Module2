package ss0_On_luyen_code.bai_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    static ArrayList<PhuongTienGiaoThong> arr = new ArrayList<>();
    public static void AddOwner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên phương tiện");
        String phuongtien = sc.nextLine();

        System.out.println("Nhập tên sản xuất");
        String TenSx = sc.nextLine();

        System.out.println("Nhập năm sản xuất");
        String NamSx = sc.nextLine();

    }
}
