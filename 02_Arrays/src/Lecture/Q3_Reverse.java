package Lecture;

import java.util.Arrays;

public class Q3_Reverse {
    public static void main(String[] args) {
        int[] array = { 12, 86, 65, 72, 6, 18 };

        int[] reversed = reverseArray(array);
        int[] reversed2 = reverseArray2(array);
        System.out.println(Arrays.toString(reversed));
        System.out.println(Arrays.toString(reversed2));

    }

    private static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[i] = array[j];
            j++;

        }
        return reverse;
    }

    private static int[] reverseArray2(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            swap(i, j, array);
            i++;
            j--;
        }

        return array;
    }

    private static int[] swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;

        return array;
    }
}
