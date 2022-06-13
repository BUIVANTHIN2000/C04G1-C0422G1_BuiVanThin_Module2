package ss3_Arrays_and_methods_in_Java.bai_tap;

import java.util.Arrays;

public class RemoveElementFromArray {
    public RemoveElementFromArray() {
    }

    public static void main(String[] args) {
        int size = 6;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5;
        System.out.print("Truoc khi xoa: ");

        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        int x = 6;
        delete(arr, n, x);
        System.out.print("\nSau khi xoa : ");
        System.out.print(Arrays.toString(arr));
    }

    static void delete(int[] arr, int n, int key) {
        int pos = searchElement(arr, key);
        if (pos == -1) {
            System.out.println("Khong tim thay phan tu can xoa");
        }

        if (n - pos >= 0) {
            System.arraycopy(arr, pos + 1, arr, pos, n - pos);
        }

    }

    static int searchElement(int[] arr, int x) {
        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }
}
