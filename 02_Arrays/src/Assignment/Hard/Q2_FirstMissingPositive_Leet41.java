package Assignment.Hard;

// https://leetcode.com/problems/first-missing-positive/submissions/1728922319/

public class Q2_FirstMissingPositive_Leet41 {
    public static void main(String[] args) {
        int nums[] = { 3, 4, -1, 1, 2 };
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    private static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            if (nums[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }
        int i = 0;
        while (i < n) {
            int val = nums[i];
            if (val >= 1 && val <= n && val != nums[val - 1]) {
                int temp = nums[i];
                nums[i] = nums[val - 1];
                nums[val - 1] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        return n + 1;
    }
}
