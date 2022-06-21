package Test;

import java.util.Scanner;

import ss0_On_luyen_code.bai_2.DanhSachOto;
import ss0_On_luyen_code.bai_2.Oto;
import ss0_On_luyen_code.bai_2.PhuongTienGiaoThong;

public class MenuPhuongTien extends Oto  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachOto dsptgt = new DanhSachOto();
        int luachon = 0;
        do {
            System.out.println("MENU____________");
            System.out.println("VUI LÒNG CHỌN CHỨC NĂNG: ");
            System.out.println(
                    "CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                            "Chọn chức năng:\n" +
                            "1. Thêm mới phương tiện.\n" +
                            "2. Hiện thị phương tiện\n" +
                            "3. Xóa phương tiện\n" +
                            "4. Tìm kiếm theo biển kiểm soát\n" +
                            "0. Thoát" + ""
            );
            luachon = sc.nextInt();
            sc.nextLine();
            if (luachon == 1) {
                System.out.println("1.Thêm Oto");
                System.out.println("2.Thêm Xe tải");
                System.out.println("3.Thêm Xe máy");
                if (luachon == 1)
                    sc.nextLine();
                System.out.println("Nhập biển kiểm soát");
                String bienKiemSoat = sc.nextLine();
                System.out.println("Tên hãng sản xuất");
                String tenHangSX = sc.nextLine();
                System.out.println("Năm sản suất");
                int namSX = sc.nextInt();
                System.out.println("Chủ sở hữu");
                String chuSoHuu = sc.nextLine();
                sc.nextLine();
                Oto oto = new Oto(bienKiemSoat, tenHangSX, namSX, chuSoHuu);
                dsptgt.themPhuongTien(oto);
                if (luachon == 3) ;

                if (luachon == 2) ;

            } else if (luachon == 2) {
             dsptgt.inDanhSachOto();

            } else if (luachon == 3) {

            } else if (luachon == 4) {

            } else if (luachon == 5) {

            }

        } while (luachon != 0);
    }

}
    



