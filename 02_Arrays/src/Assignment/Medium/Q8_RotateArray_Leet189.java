package Assignment.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/submissions/1728707942/
// https://leetcode.com/problems/rotate-array/submissions/1728710155/

public class Q8_RotateArray_Leet189 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        rotate(nums, k);
    }

    private static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1 || n == 0 || k == 0) {
            return;
        }
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        System.out.println(Arrays.toString(nums));

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
