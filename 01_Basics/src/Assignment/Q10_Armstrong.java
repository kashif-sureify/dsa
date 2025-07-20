package Assignment;

public class Q10_Armstrong {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(checkArmstrong(n, countDigit(n)));

        armstrongNum(100, 1000);
    }

    private static void armstrongNum(int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            if (checkArmstrong(i, countDigit(i))) {
                System.out.println(i);
            }

        }
    }

    private static boolean checkArmstrong(int n, int power) {
        int armstrong = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            armstrong = armstrong + exponent(rem, power);
            n /= 10;
        }
        return temp == armstrong;
    }

    private static int exponent(int rem, int power) {
        int value = 1;
        for (int i = 0; i < power; i++) {
            value = value * rem;
        }

        return value;
    }

    private static int countDigit(int n) {
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }
}
