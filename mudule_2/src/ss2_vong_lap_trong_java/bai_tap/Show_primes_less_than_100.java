package ss2_vong_lap_trong_java.bai_tap;

public class Show_primes_less_than_100 {
    public Show_primes_less_than_100() {
    }

    public static void main(String[] args) {
        int limit = 100;
        System.out.println("Prime numbers between 1 and " + limit);

        for(int i = 1; i < 100; ++i) {
            boolean isPrime = true;

            for(int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}