package Assignment.Medium;

// https://leetcode.com/problems/house-robber/submissions/1728844793/

public class Q10_HouseRobber_Leet198 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 };
        int res = rob(nums);
        System.out.println(res);
    }

    private static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);

        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
