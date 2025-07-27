package Assignment;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1713604920/

public class Q17_CountEventNo_Leet1295 {
    public static void main(String[] args) {
        int nums[] = { 12, 345, 75, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (iseven(num)) {
                count++;
            }
        }

        return count;
    }

    private static boolean iseven(int num) {
        int countDigit = 0;

        while (num > 0) {
            num = num / 10;
            countDigit++;

        }

        return countDigit % 2 == 0;
    }
}
