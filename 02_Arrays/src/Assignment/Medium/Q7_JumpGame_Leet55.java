package Assignment.Medium;
// https://leetcode.com/problems/jump-game/submissions/1728672557/
public class Q7_JumpGame_Leet55 {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 0, 1, 4 };
        boolean ans = canJump(nums);
        System.out.println(ans);
    }

    private static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}
