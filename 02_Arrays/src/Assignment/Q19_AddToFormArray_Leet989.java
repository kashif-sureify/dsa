package Assignment;

// https://leetcode.com/problems/add-to-array-form-of-integer/submissions/1714001674/

import java.util.ArrayList;
import java.util.List;

public class Q19_AddToFormArray_Leet989 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        for (int i : addToArrayForm(num, k)) {
            System.out.println(i);
        }

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            list.add(0, k % 10);
            k /= 10;
        }

        return list;
    }
}
