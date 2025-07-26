package Assignment;

import java.util.Arrays;
// https://leetcode.com/problems/running-sum-of-1d-array/submissions/1711757530/

public class Q3_RunningSumArray_Leet1480 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int result[] = runningSum(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
