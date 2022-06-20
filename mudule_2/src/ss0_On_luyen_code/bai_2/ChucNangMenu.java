package ss0_On_luyen_code.bai_2;

import ss0_On_luyen_code.bai_2.XeMay;
import ss0_On_luyen_code.bai_2.Oto;
import ss0_On_luyen_code.bai_2.XeTai;
import ss0_On_luyen_code.bai_2.PhuongTienGiaoThong;

import java.util.ArrayList;
import java.util.Scanner;

class Manage {
    public static void main(String[] args) {
        ArrayList<PhuongTienGiaoThong> vehicles = new ArrayList<>();
        int check;

        vehicles.add(new Oto(9999, "Honda", 2022, "join", 4, "sport car"));
        vehicles.add(new XeTai(0000, "Huyn Dai", 2020, "jenny", 9));
        vehicles.add(new XeMay(70741, "yamaha", 2015, "son", 150));
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG!");
            System.out.println("1.Thêm mới phương tiện.");
            System.out.println("2.Hiển thị phương tiện");
            System.out.println("3.Xóa phương tiện.");
            System.out.println("4.Tìm kiếm theo biển kiểm soát.");
            System.out.println("5.Thoát");

            Scanner input = new Scanner(System.in);
            System.out.println("nhập vào chức năng muốn dùng:");
            check = input.nextInt();
            switch (check) {
                case 1:
                    System.out.println("1.add new car");
                    System.out.println("2.add new truck");
                    System.out.println("3.add new bike");
                    int add = input.nextInt();
                    if (add == 1)
                        vehicles.add(new Oto());
                    if (add == 2)
                        vehicles.add(new XeTai());
                    if (add == 3)
                        vehicles.add(new XeMay());
                    break;
                case 2:
                    for (int i = 0; i < vehicles.size(); i++) {
                        System.out.println("STT." + i + "\n" + vehicles.get(i));
                        System.out.println("==================================");
                    }
                    break;
                case 3:
                    System.out.println("nhập vào số thứ tự mún xóa:");
                    int i = input.nextInt();
                    vehicles.remove(i);
                    System.out.println("đã xóa!!! bấm phím 2 để hiển thị danh sách phương tiện:");
                    break;
                case 4:
                    System.out.println("nhập vào biển kiểm soát cần tìm:");
                    int id = input.nextInt();
                    boolean flg = true;
                    for (int j = 0; j < vehicles.size(); j++) {
                        if (vehicles.get(j).getBienKiemSoat() == id) {
                            System.out.println(vehicles.get(j));
                            flg = false;
                        }
                    }
                    if (flg)
                        System.out.println("biển kiểm soát này không tồn tại nha bro!");
                    break;
                case 5:
                    System.out.println("thoát");
                    break;
            }
            System.out.println();
        } while (check < 5);
    }
}