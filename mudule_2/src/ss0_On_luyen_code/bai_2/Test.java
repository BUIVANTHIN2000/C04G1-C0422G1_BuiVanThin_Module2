package ss0_On_luyen_code.bai_2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<PhuongTienGiaoThong> pt = new ArrayList<>();
        pt.add(new Oto());
        pt.add(new XeMay());
        pt.add(new XeTai());

        System.out.println(pt.get(0));

        for (int i = 0; i < pt.size(); i++) {
            System.out.println(pt.get(i));
        }
    }
}
