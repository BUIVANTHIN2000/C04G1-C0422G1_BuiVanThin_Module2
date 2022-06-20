package ss0_On_luyen_code.bai_1;

import ss0_On_luyen_code.bai_1.MayTinhBoTuiInterface;

public class MayTinhVinacal500 implements MayTinhBoTuiInterface {
    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        return a * b;
    }
}
