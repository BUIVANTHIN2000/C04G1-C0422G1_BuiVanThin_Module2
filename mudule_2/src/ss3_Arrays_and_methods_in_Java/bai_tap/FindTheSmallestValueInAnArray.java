package ss3_Arrays_and_methods_in_Java.bai_tap;

public class FindTheSmallestValueInAnArray {
    public FindTheSmallestValueInAnArray() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 7, 5, 9};
        int min = a[0];

        for(int i = 0; i < a.length; ++i) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Phần tử nhỏ nhât " + min);
    }
}
