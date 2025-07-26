package Assignment;

import java.util.Arrays;

public class Q10_TargetArray_Leet1389 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int index[] = { 0, 1, 2, 2, 1 };
        int result[] = createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int result[] = new int[nums.length];

        int size = 0;
        for (int i = 0; i < index.length; i++) {
            int insertPos = index[i];

            for (int j = size; j > insertPos; j--) {
                result[j] = result[j - 1];
            }

            result[insertPos] = nums[i];
            size++;

        }

        return result;
    }
}
