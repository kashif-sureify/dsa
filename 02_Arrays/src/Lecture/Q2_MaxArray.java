package Lecture;

public class Q2_MaxArray {
    public static void main(String[] args) {
        int[] array = { 105, 6, 15, 99, 51, 100 };
        System.out.println(rangeMax(array, 1, 4));
        System.out.println(findMax(array));
    }

    private static int rangeMax(int[] array, int i, int j) {
        if (i > j || array == null) {
            return -1;
        }
        int max = array[i];
        for (int k = i; k <= j; k++) {
            if (array[k] > max) {
                max = array[k];
            }
        }
        return max;

    }

    private static int findMax(int[] array) {
        if (array == null) {
            return -1;
        }
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
