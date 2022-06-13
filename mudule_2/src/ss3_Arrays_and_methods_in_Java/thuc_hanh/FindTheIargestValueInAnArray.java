package ss3_Arrays_and_methods_in_Java.thuc_hanh;

import java.util.Scanner;

public class FindTheIargestValueInAnArray {
    public FindTheIargestValueInAnArray() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while(size > 20);

        int[] array = new int[size];
        int i = 0;

        while(i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            ++i;
            System.out.print("Property list: ");

            int max;
            for(max = 0; max < array.length; ++max) {
                System.out.println(array[max] + "\t");
            }

            max = array[0];
            int index = 1;

            for(int j = 0; j < array.length; ++j) {
                if (array[j] > max) {
                    max = array[j];
                    index = j + 1;
                }
            }

            System.out.println("The largest property value in the list is " + max + " ,at position " + index);
        }

    }
}
