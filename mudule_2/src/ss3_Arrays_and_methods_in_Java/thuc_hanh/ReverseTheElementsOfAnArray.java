package ss3_Arrays_and_methods_in_Java.thuc_hanh;

import java.util.Scanner;

public class ReverseTheElementsOfAnArray {
    public ReverseTheElementsOfAnArray() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while(size > 20);

        int[] array = new int[size];

        for(int i = 0; i < array.length; ++i) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        int[] var5 = array;
        int temp = array.length;

        int var7;
        int k;
        for(var7 = 0; var7 < temp; ++var7) {
            k = var5[var7];
            System.out.print(k + "\t");
        }

        for(int j = 0; j < array.length / 2; ++j) {
            temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        var5 = array;
        temp = array.length;

        for(var7 = 0; var7 < temp; ++var7) {
            k = var5[var7];
            System.out.print(k + "\t");
        }

    }
}
