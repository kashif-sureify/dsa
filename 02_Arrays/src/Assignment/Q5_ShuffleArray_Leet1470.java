package Assignment;

// https://leetcode.com/problems/shuffle-the-array/submissions/1712368347/

import java.util.Arrays;

public class Q5_ShuffleArray_Leet1470 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int result[] = shuffle(nums, n);
        System.out.println(Arrays.toString(result));

    }

    private static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int j = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result[i] = nums[j];
            result[i + 1] = nums[nums.length / 2 + j];
            j++;

        }
        return result;
    }
}
