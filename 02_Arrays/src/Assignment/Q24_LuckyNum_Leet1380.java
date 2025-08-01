package Assignment;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/1718993460/

public class Q24_LuckyNum_Leet1380 {
    public static void main(String[] args) {
        int matrix[][] = { { 7, 3, 8 }, { 11, 13, 9 }, { 16, 15, 17 } };

        System.out.println(luckyNumbers(matrix));

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rowMin[] = new int[matrix.length];
        int colMin[] = new int[matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            int min = matrix[row][0];
            for (int col = 1; col < matrix[row].length; col++) {
                if (min > matrix[row][col]) {
                    min = matrix[row][col];
                }
            }
            rowMin[row] = min;
        }

        for (int col = 0; col < matrix[0].length; col++) {
            int max = matrix[0][col];
            for (int row = 1; row < matrix.length; row++) {
                if (max < matrix[row][col]) {
                    max = matrix[row][col];
                }
            }
            colMin[col] = max;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMin[j]) {
                    list.add(matrix[i][j]);
                }

            }
        }

        return list;

    }
}
