package ss3_Arrays_and_methods_in_Java.bai_tap;

public class AddElementToArray {
    public AddElementToArray() {
    }

    public static void main(String[] args) {
        int atIndex = 1;
        int value = 9;
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5;
        System.out.print("Trước khi chèn: ");
        int[] var5 = arr;
        int var6 = arr.length;

        int var7;
        int element;
        for(var7 = 0; var7 < var6; ++var7) {
            element = var5[var7];
            System.out.print(element + " ");
        }

        System.out.println();

        for(int i = n; i > atIndex; --i) {
            arr[i] = arr[i - 1];
        }

        arr[atIndex] = value;
        System.out.println("Sau khi chèn");
        var5 = arr;
        var6 = arr.length;

        for(var7 = 0; var7 < var6; ++var7) {
            element = var5[var7];
            System.out.print(element + " ");
        }

    }
}
