package Assignment.Medium;

import java.util.Arrays;

public class Q3_SpiralMat3_Leet885 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;
        int rStart = 1;
        int colStart = 4;

        int[][] matrix = spiralMatrixIII(rows, cols, rStart, colStart);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] spiralMatrixIII(int rows, int cols, int rStart, int colStart) {
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int[][] result = new int[rows * cols][2];
        int d = 0, steps = 0;
        result[0] = new int[] { rStart, colStart };
        int count = 1;

        while (count < rows * cols) {
            if (d == 0 || d == 2) {
                steps++;
            }

            for (int i = 0; i < steps; i++) {
                rStart += directions[d][0];
                colStart += directions[d][1];

                if (rStart >= 0 && rStart < rows && colStart >= 0 && colStart < cols) {
                    result[count++] = new int[] { rStart, colStart };

                }
                if (count == rows * cols) {
                    return result;
                }
            }

            d = (d + 1) % 4;

        }

        return result;
    }

    class Solution {
        int leftBound, topBound, rightBound, bottomBound, currentIndex;
        int[][] path;

        public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
            int totalCells = cols * rows;
            path = new int[totalCells][];

            initializeBounds(rStart, cStart);
            addToPath(rStart, cStart);

            while (currentIndex < totalCells) {
                if (topBound >= 0) {
                    traverseEast(Math.max(0, leftBound + 1), Math.min(cols - 1, rightBound));
                }
                bottomBound++;
                if (currentIndex >= totalCells)
                    break;

                if (rightBound < cols) {
                    traverseSouth(Math.max(0, topBound + 1), Math.min(rows - 1, bottomBound));
                }
                leftBound--;
                if (currentIndex >= totalCells)
                    break;

                if (bottomBound < rows) {
                    traverseWest(Math.min(cols - 1, rightBound - 1), Math.max(0, leftBound));
                }
                topBound--;
                if (currentIndex >= totalCells)
                    break;

                if (leftBound >= 0) {
                    traverseNorth(Math.min(rows - 1, bottomBound - 1), Math.max(0, topBound));
                }
                rightBound++;
                if (currentIndex >= totalCells)
                    break;
            }

            return path;
        }

        private void initializeBounds(int rStart, int cStart) {
            leftBound = rightBound = cStart;
            topBound = bottomBound = rStart;
            currentIndex = 0;
            rightBound++;
        }

        private void addToPath(int row, int col) {
            path[currentIndex++] = new int[] { row, col };
        }

        private void traverseEast(int start, int end) {
            for (int i = start; i <= end; i++)
                addToPath(topBound, i);
        }

        private void traverseWest(int start, int end) {
            for (int i = start; i >= end; i--)
                addToPath(bottomBound, i);
        }

        private void traverseSouth(int start, int end) {
            for (int i = start; i <= end; i++)
                addToPath(i, rightBound);
        }

        private void traverseNorth(int start, int end) {
            for (int i = start; i >= end; i--)
                addToPath(i, leftBound);
        }
    }

}
