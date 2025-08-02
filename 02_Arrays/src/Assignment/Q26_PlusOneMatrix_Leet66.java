package Assignment;

import java.util.Arrays;
// https://leetcode.com/problems/plus-one/submissions/1720527453/

public class Q26_PlusOneMatrix_Leet66 {
    public static void main(String[] args) {
        int digits[] = { 9, 1, 9 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigitArray = new int[digits.length + 1];
        newDigitArray[0] = 1;
        return newDigitArray;
    }
}
