package Assignment;
// https://leetcode.com/problems/number-of-good-pairs/submissions/1712422364/

public class Q7_NoOfGoodPairs_Leet512 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs(nums));
    }

    private static int numIdenticalPairs(int[] nums) {
        int goodPairsCount = 0;
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    goodPairsCount++;
                }
            }
        }
        return goodPairsCount;
    }
}
