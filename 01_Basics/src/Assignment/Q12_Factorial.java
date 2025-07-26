package Assignment;

public class Q12_Factorial {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(fact(n));

    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
