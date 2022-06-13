package ss2_vong_lap_trong_java.bai_tap;

public class Show_types {
    public Show_types() {
    }

    public static void main(String[] args) {
        int k = 0;
        int height = 3;
        int width = 7;

        int i;
        int space;
        for(i = 1; i <= height; ++i) {
            for(space = 1; space <= width; ++space) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        System.out.println(" ");

        for(i = 1; i <= 5; ++i) {
            for(space = 1; space <= i; ++space) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        System.out.println(" ");

        for(i = 5; i >= 1; --i) {
            for(space = 1; space <= i; ++space) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        for(i = 1; i <= 10; k = 0) {
            for(space = 1; space <= 10 - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
            ++i;
        }

    }
}