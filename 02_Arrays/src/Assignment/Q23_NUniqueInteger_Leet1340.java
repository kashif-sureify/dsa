package Assignment;

// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/submissions/1715251493/
import java.util.Arrays;

public class Q23_NUniqueInteger_Leet1340 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    private static int[] sumZero(int n) {
        int result[] = new int[n];
        int mid = n / 2;
        int value = mid;
        if (n % 2 != 0) {
            result[mid] = 0;
        }
        for (int i = 0; i < mid; i++) {
            result[i] = value;
            result[n - 1 - i] = -value;
            value--;
        }
        return result;
    }
}
