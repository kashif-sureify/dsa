package Assignment;

public class Q3_Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        fibonacciSeries(n);
        int nthTerm = nthFibo(n);
        System.out.println(n + "th Fibonacci term = " + nthTerm);
    }

    private static int nthFibo(int n) {
        int a = 0;
        int b = 1;
        while (n - 2 > 0) {
            int temp = b;
            b = a + b;
            a = temp;

            n--;
        }

        return b;
    }

    private static void fibonacciSeries(int len) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        while (len - 2 > 0) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;

            len--;

        }
    }
}
