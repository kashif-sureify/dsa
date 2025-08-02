package Assignment;

import java.util.Arrays;
// https://leetcode.com/problems/reshape-the-matrix/submissions/1720479778/

public class Q29_ReshapeMatrix_Leet566 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        matrixReshape(mat, 2, 2);
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] reshapedMat = new int[r][c];
        int index = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int row = index / c;
                int col = index % c;
                reshapedMat[row][col] = mat[i][j];
                index++;

            }
        }

        for (int[] newMat : reshapedMat) {
            System.out.println(Arrays.toString(newMat));
        }
        return reshapedMat;
    }
}
