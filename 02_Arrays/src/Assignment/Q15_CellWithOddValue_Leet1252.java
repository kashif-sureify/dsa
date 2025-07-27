package Assignment;
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/submissions/1713466022/


public class Q15_CellWithOddValue_Leet1252 {
    public static void main(String[] args) {
        int m = 2, n = 2;
        int[][] indices = { { 1, 1 }, { 0, 0 } };
        System.out.println(oddCells(m, n, indices));
    }

    private static int oddCells(int m, int n, int[][] indices) {
        int count = 0;

        int[][] matrix = incrementedMatrix(m, n, indices);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int[][] incrementedMatrix(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int rowNum = indices[i][0];
            int colNum = indices[i][1];

            // increment the row
            for (int j = 0; j < n; j++) {
                matrix[rowNum][j]++;
            }
            // increment the column
            for (int j = 0; j < m; j++) {
                matrix[j][colNum]++;
            }
        }

        return matrix;
    }
}
