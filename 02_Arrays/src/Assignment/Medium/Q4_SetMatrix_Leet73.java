package Assignment.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/set-matrix-zeroes/submissions/1723838141/

public class Q4_SetMatrix_Leet73 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int result[][] = setZeroes(matrix);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
