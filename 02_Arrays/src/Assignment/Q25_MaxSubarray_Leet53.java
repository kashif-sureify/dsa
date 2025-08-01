package Assignment;
// https://leetcode.com/problems/maximum-subarray/submissions/1719012167/

public class Q25_MaxSubarray_Leet53 {
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum = Integer.max(currSum + nums[i], nums[i]);
            maxSum = Integer.max(maxSum, currSum);
        }
        return maxSum;

    }
}
