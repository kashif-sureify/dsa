package Assignment;
// https://leetcode.com/problems/build-array-from-permutation/submissions/1711739899/

import java.util.Arrays;

public class Q1_BuildFromPermutation_Leet1920 {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 5, 3, 4 };

        int[] result = buildPermutation(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] buildPermutation(int[] arr) {
        int newArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr[i]];
        }

        return newArr;
    }
}
