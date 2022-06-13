package ss2_vong_lap_trong_java.bai_tap;

public class Show_first_20_primes {
    public Show_first_20_primes() {
    }

    public static void main(String[] args) {
        int n = 0;

        for(int i = 1; n < 20; ++i) {
            int j = 1;

            int ct;
            for(ct = 0; j <= i; ++j) {
                if (i % j == 0) {
                    ++ct;
                }
            }

            if (ct == 2) {
                System.out.printf("%d ", i);
                ++n;
            }
        }

    }
}
