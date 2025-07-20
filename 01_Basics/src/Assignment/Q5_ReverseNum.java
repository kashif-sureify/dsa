package Assignment;

public class Q5_ReverseNum {
    public static void main(String[] args) {
        int n = 72963;
        int reversed = reverseFunc(n);
        System.out.println(reversed);
    }

    private static int reverseFunc(int n) {
        int reverse = 0;

        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;

        }

        return reverse;
    }
}
