package Assignment.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/submissions/1728724848/

public class Q9_SortColors_Leet75 {
    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
    }

    private static void sortColors(int[] nums) {
        int count0 = count(nums, 0);
        int count1 = count(nums, 1);

        for (int i = 0; i < nums.length; i++) {
            if (count0 > 0) {
                nums[i] = 0;
                count0--;
            } else if (count1 > 0) {
                nums[i] = 1;
                count1--;
            } else {
                nums[i] = 2;
            }

        }

        System.out.println(Arrays.toString(nums));
    }

    private static int count(int[] nums, int target) {
        int i = 0;
        int count = 0;
        while (i < nums.length) {
            if (nums[i] == target) {
                count++;
            }
            i++;
        }

        return count;
    }
}
