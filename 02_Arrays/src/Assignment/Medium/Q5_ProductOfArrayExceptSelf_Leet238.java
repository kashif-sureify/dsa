package Assignment.Medium;

import java.util.Arrays;
// https://leetcode.com/problems/product-of-array-except-self/submissions/1726070188/

public class Q5_ProductOfArrayExceptSelf_Leet238 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int result[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int leftProduct[] = new int[n];
        int rightProduct[] = new int[n];

        leftProduct[0] = 1;
        rightProduct[n - 1] = 1;

        int leftProductValue = 1;
        int rightProductValue = 1;

        for (int i = 1; i < n; i++) {
            leftProductValue *= nums[i - 1];
            leftProduct[i] = leftProductValue;
        }

        for (int i = n - 2; i >= 0; i--) {
            rightProductValue *= nums[i + 1];
            rightProduct[i] = rightProductValue;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = leftProduct[i] * rightProduct[i];
        }

        return nums;
    }
}
