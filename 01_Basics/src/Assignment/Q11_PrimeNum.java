package Assignment;

public class Q11_PrimeNum {
    public static void main(String[] args) {
        int n = 23;
        System.out.println(checkPrime(n));
        System.out.println(checkPrime2(n));
        System.out.println(checkPrime3(n));

    }

    private static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    private static boolean checkPrime2(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    private static boolean checkPrime3(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
