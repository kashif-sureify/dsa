package Assignment;

import java.util.Arrays;
// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/submissions/1714998867/

public class Q21_RotationMatrix_Leet1886 {
    public static void main(String[] args) {
        int mat[][] = { { 0, 1 }, { 1, 0 } };
        int target[][] = { { 1, 0 }, { 0, 1 } };

        System.out.println(findRotation(mat, target));
    }

    private static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            int[][] transpose = transpose(mat);
            int[][] newMatrix = reverse(transpose);
            if (Arrays.deepEquals(newMatrix, target)) {
                return true;
            }
            mat = newMatrix;
        }

        return false;
    }

    private static int[][] reverse(int[][] transpose) {
        int n = transpose.length;
        int reverse[][] = new int[n][n];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                reverse[i][n - 1 - j] = transpose[i][j];
            }
        }
        return reverse;
    }

    private static int[][] transpose(int[][] mat) {
        int n = mat.length;
        int transpose[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = mat[i][j];
            }
        }

        return transpose;
    }
}
