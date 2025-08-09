package Assignment.Hard;

// https://leetcode.com/problems/check-if-it-is-a-good-array/submissions/1729328180/

public class Q3_GoodArray_Leet1250 {
    public static void main(String[] args) {
        int nums[] = { 3, 6 };
        boolean ans = isGoodArray(nums);
        System.out.println(ans);
    }

    private static boolean isGoodArray(int[] nums) {
        int g = nums[0];
        for (int i = 1; i < nums.length; i++) {
            g = gcd(g, nums[i]);
            if (g == 1) {
                return true;
            }
        }
        return g == 1;
    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return Math.abs(num1);
    }
}
