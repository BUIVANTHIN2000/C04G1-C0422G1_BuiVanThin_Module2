package ss0_On_luyen_code.bai_2;

public class Oto extends PhuongTienGiaoThong {
    private int soCho = 3;
    private String kieuXe = "Du Lich";
    public Oto() {
    }

    public Oto(int bienKiemSoat, String tenSanXuat, int namSanXuat, String chuSoHuu, int soCho, String kieuXe) {
        super(bienKiemSoat, tenSanXuat, namSanXuat, chuSoHuu);
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu) {

    }

    @Override
    public int getBienKiemSoat() {
        return super.getBienKiemSoat();
    }

    @Override
    public void setBienKiemSoat(int bienKiemSoat) {

        super.setBienKiemSoat(bienKiemSoat);
    }

    @Override
    public String getTenSanXuat() {

        return super.getTenSanXuat();
    }

    @Override
    public void setTenSanXuat(String tenSanXuat) {

        super.setTenSanXuat(tenSanXuat);
    }

    @Override
    public int getNamSanXuat() {

        return super.getNamSanXuat();
    }

    @Override
    public void setNamSanXuat(int namSanXuat) {

        super.setNamSanXuat(namSanXuat);
    }

    @Override
    public String getChuSoHuu() {

        return super.getChuSoHuu();
    }

    @Override
    public void setChuSoHuu(String chuSoHuu) {
        super.setChuSoHuu(chuSoHuu);
    }

    @Override
    public String toString() {
        return "Oto" +
                "soCho=" + soCho +
                ", kieuXe='" + kieuXe + '\'';

    }
}

