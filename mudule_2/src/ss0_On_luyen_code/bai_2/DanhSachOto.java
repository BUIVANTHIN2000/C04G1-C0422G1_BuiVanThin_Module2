package ss0_On_luyen_code.bai_2;

import java.util.ArrayList;

public class DanhSachOto {
    private ArrayList<Oto> danhSach;

    public DanhSachOto() {
        this.danhSach = new ArrayList<Oto>();
    }

    public DanhSachOto(ArrayList<Oto> danhSach) {
        this.danhSach = danhSach;
    }

    public void themPhuongTien(Oto oto) {
        this.danhSach.add(oto);
    }

    @Override
    public String toString() {
        return "DanhSachOto{" +
                "danhSach=" + danhSach +
                '}';
    }
    public void inDanhSachOto() {
        for ( Oto oTo: danhSach ) {
            System.out.println(oTo);
        }

    }
}

