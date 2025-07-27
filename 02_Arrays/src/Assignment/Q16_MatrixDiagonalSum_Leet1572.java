package Assignment;
// http://leetcode.com/problems/matrix-diagonal-sum/submissions/1713497429/

public class Q16_MatrixDiagonalSum_Leet1572 {
    public static void main(String[] args) {
        // int mat[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1
        // } };
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(mat));
    }

    private static int diagonalSum(int[][] mat) {
        int sum = 0;
        int i = 0;
        int n = mat.length;
        while (i < n) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
            i++;
        }

        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}
