package Assignment;

import java.util.Arrays;

// https://leetcode.com/problems/flipping-an-image/submissions/1713322456/

public class Q14_FlipImage_Leet832 {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] result = flipAndInvertImage(image);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int revered[] = reverseRow(image[i]);
            for (int j = 0; j < revered.length; j++) {
                revered[j] = revered[j] == 0 ? 1 : 0;
            }
            image[i] = revered;

        }

        return image;
    }

    private static int[] reverseRow(int[] row) {
        int[] reverse = new int[row.length];
        for (int i = 0; i < row.length; i++) {
            reverse[i] = row[row.length - 1 - i];
        }
        return reverse;
    }
}
