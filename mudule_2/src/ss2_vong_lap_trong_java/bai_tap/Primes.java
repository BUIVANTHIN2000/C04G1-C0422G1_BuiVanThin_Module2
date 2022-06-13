package ss2_vong_lap_trong_java.bai_tap;

public class Primes {
    public Primes() {
    }

    public static void main(String[] args) {
        int count = 0;
        int countSNT = 0;

        for(int i = 2; i < 1000 && countSNT < 20; ++i) {
            for(int j = 1; j <= i; ++j) {
                if (i % j == 0) {
                    ++count;
                }
            }

            if (count == 2) {
                System.out.print(i + "\n");
                ++countSNT;
            }

            count = 0;
        }

    }
}
