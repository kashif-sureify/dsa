package Assignment;

import java.util.Arrays;
// https://leetcode.com/problems/transpose-matrix/submissions/1713973767/

public class Q18_TransposeMatrix_Leet867 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int result[][] = transpose(matrix);
        for (int[] mat : result) {
            System.out.println(Arrays.toString(mat));
        }
    }

    private static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int newMatrix[][] = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }
}
