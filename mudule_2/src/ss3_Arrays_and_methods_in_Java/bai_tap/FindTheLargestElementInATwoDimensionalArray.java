package ss3_Arrays_and_methods_in_Java.bai_tap;

public class FindTheLargestElementInATwoDimensionalArray {
    public FindTheLargestElementInATwoDimensionalArray() {
    }

    public static void main(String[] args) {
        int[][] m = new int[3][4];
        int max = m[0][0];
        m[0][0] = 1;
        m[2][3] = 9;
        m[1][2] = 5;

        int i;
        int j;
        for(i = 0; i < m.length; ++i) {
            for(j = 0; j < m[i].length; ++j) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }

        for(i = 0; i < m.length; ++i) {
            for(j = 0; j < m[i].length; ++j) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }

        System.out.println("Is max : " + max);
    }
}
