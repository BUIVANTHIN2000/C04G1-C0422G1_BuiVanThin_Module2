package ss0_On_luyen_code.bai_2;

public class XeTai extends PhuongTienGiaoThong {
    private double TrongTai = 30.0;
    public XeTai() {
    }
    public XeTai(int bienKiemSoat, String tenSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenSanXuat, namSanXuat, chuSoHuu);
        TrongTai = trongTai;
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
        return super.toString()+"XeTai" +
                "TrongTai=" + TrongTai +
                '}';
    }
}
