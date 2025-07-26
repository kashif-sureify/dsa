package Assignment;

public class Q13_PerfectNum {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(checkPerfect(n));
        System.out.println(checkPerfect2(n));
        System.out.println(checkPerfect3(n));

    }

    private static boolean checkPerfect(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    private static boolean checkPerfect2(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    private static boolean checkPerfect3(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    sum += i;
                } else {
                    sum += i + (n / i);
                }
            }
        }
        return sum == n;
    }

}
