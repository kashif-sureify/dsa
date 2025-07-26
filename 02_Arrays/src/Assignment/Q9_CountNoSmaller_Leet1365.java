package Assignment;

import java.util.Arrays;
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/1712443104/

public class Q9_CountNoSmaller_Leet1365 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        // output={4,0,1,1,3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            countArray[i] = count;
        }
        return countArray;
    }
}
