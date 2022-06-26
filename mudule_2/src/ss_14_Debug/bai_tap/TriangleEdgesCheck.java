package ss_14_Debug.bai_tap;

import ss_14_Debug.bai_tap.TriangleEdgesException;

public class TriangleEdgesCheck {
    //Hàm kiểm tra tam giác hợp lệ
    public void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Lỗi: Tam giác không hợp lệ!");
        } else {
            System.out.println("Tam giác hợp lệ!");
        }
    }
}
