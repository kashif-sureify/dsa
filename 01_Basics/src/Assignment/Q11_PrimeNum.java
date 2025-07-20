package Assignment;

public class Q11_PrimeNum {
    public static void main(String[] args) {
        int n = 23;
        System.out.println(checkPrime(n));
    }

    private static boolean checkPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
