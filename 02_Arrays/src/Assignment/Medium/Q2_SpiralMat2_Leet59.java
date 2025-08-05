package Assignment.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/spiral-matrix-ii/submissions/1722252964/

public class Q2_SpiralMat2_Leet59 {
    public static void main(String[] args) {
        int n = 3;
        int resMat[][] = generateMatrix(n);
        for (int[] row : resMat) {
            System.out.println(Arrays.toString(row));
        }

    }

    private static int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        int index = 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            // top
            for (int i = colBegin; i <= colEnd; i++) {
                matrix[rowBegin][i] = index++;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                matrix[i][colEnd] = index++;
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    matrix[rowEnd][i] = index++;
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    matrix[i][colBegin] = index++;
                }
            }
            colBegin++;
        }

        return matrix;
    }

}
