package ss0_On_luyen_code.bai_2;

public class PhuongTienGiaoThong {
private int BienKiemSoat;
private String TenSanXuat;
private int NamSanXuat;
private String ChuSoHuu;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(int bienKiemSoat, String tenSanXuat, int namSanXuat, String chuSoHuu) {
        BienKiemSoat = bienKiemSoat;
        TenSanXuat = tenSanXuat;
        NamSanXuat = namSanXuat;
        ChuSoHuu = chuSoHuu;
    }

    public PhuongTienGiaoThong(String bienKiemSoat, String tenSanXuat, int namSanXuat, String chuSoHuu) {
    }

    public int getBienKiemSoat() {
        return BienKiemSoat;
    }

    public void setBienKiemSoat(int bienKiemSoat) {
        BienKiemSoat = bienKiemSoat;
    }

    public String getTenSanXuat() {
        return TenSanXuat;
    }

    public void setTenSanXuat(String tenSanXuat) {
        TenSanXuat = tenSanXuat;
    }

    public int getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return ChuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        ChuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTienGiaoThong" +
                "BienKiemSoat=" + BienKiemSoat +
                ", TenSanXuat='" + TenSanXuat + '\'' +
                ", NamSanXuat=" + NamSanXuat +
                ", ChuSoHuu='" + ChuSoHuu + '\'';
    }
}

