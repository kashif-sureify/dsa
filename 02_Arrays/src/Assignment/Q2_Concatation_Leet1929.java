package Assignment;

import java.util.Arrays;

// https://leetcode.com/problems/concatenation-of-array/submissions/1711749032/

public class Q2_Concatation_Leet1929 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int concatArray[] = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            concatArray[i] = nums[i];
            concatArray[nums.length + i] = nums[i];
        }
        return concatArray;
    }
}
