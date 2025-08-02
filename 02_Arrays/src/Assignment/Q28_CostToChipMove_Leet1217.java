package Assignment;

// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/submissions/1720634674/
public class Q28_CostToChipMove_Leet1217 {
    public static void main(String[] args) {
        int[] position = { 2, 2, 2, 3, 3 };
        System.out.println(minCostToMoveChips(position));
    }

    private static int minCostToMoveChips(int[] position) {
        int evenCount = 0, oddCount = 0;
        for (int pos : position) {

            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }
        return Integer.min(evenCount, oddCount);

    }
}
