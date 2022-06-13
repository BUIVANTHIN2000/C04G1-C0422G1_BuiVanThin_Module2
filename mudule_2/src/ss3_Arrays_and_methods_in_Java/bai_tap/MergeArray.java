package ss3_Arrays_and_methods_in_Java.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public MergeArray() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many values you want in fist array?");
        int n1 = sc.nextInt();
        System.out.println("Enter how many values you want in second array?");
        int n2 = sc.nextInt();
        int n3 = n1 + n2;
        int[] A = new int[n1];
        int[] B = new int[n2];
        int[] C = new int[n3];
        System.out.println("Enter " + n1 + " values");

        int i;
        for(i = 0; i < A.length; ++i) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter " + n1 + " values for Array B");

        for(i = 0; i < n2; ++i) {
            B[i] = sc.nextInt();
        }

        for(i = 0; i < n1; ++i) {
            C[i] = A[i];
        }

        for(i = 0; i < n2; ++i) {
            C[n1 + i] = B[i];
        }

        System.out.println("Merged arrays is:");

        for(i = 0; i < C.length; ++i) {
            System.out.println(C[i] + " ");
        }

    }
}
