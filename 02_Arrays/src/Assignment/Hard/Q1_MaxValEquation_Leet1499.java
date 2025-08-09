package Assignment.Hard;

public class Q1_MaxValEquation_Leet1499 {
    public static void main(String[] args) {
        int points[][] = { { 1, 3 }, { 2, 0 }, { 5, 10 }, { 6, -10 } };
        int k = 1;
        int ans = findMaxValueOfEquation(points, k);
        System.out.println(ans);
    }

    private static int findMaxValueOfEquation(int[][] points, int k) {
        int rows = points.length;
        int max = Integer.MIN_VALUE;
        int bestIdx = 0;
        for (int i = 0; i < rows; i++) {
            while (bestIdx < i && points[i][0] - points[bestIdx][0] > k) {
                bestIdx++;
            }

            if (bestIdx < i) {
                int temp = (points[bestIdx][1] - points[bestIdx][0]) + points[i][0] + points[i][1];
                max = Math.max(max, temp);
            }

            if (points[i][1] - points[i][0] > points[bestIdx][1] - points[bestIdx][0]) {
                bestIdx = i;

            }

        }
        return max;
    }

}

// if (points[i + 1][0] - points[i][0] <= k) {
// int temp = (points[i][1] - points[i][0]) + points[i + 1][0] + points[i +
// 1][1];
// if (max < temp) {
// max = temp;
// }
// }