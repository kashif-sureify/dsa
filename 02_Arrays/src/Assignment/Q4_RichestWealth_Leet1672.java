package Assignment;

// https://leetcode.com/problems/richest-customer-wealth/submissions/1711766242/

public class Q4_RichestWealth_Leet1672 {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int result = maximumWealth(accounts);
        System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
