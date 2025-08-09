package Assignment.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1726891416/
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1726896963/

public class Q6_FindElementSortedArray_Leet34 {
    public static void main(String[] args) {
        int nums[] = {};
        int target = 6;

        int ans[] = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] { -1, -1 };
        }
        int[] result = new int[2];

        int ptr1 = -1;
        int ptr2 = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (ptr1 == -1) {
                    ptr1 = i;
                    ptr2 = i;
                } else {
                    ptr2 = i;
                }

            }

        }

        result[0] = ptr1;
        result[1] = ptr2;

        return result;
    }
}
