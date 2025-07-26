package Lecture;

import java.util.Arrays;

public class Q1_Swap {
    public static void main(String[] args) {
        int[] arr = { 87, 7, 23, 6, 34 };
        int[] swappedArray = swap(arr, 2, 4);
        System.out.println(Arrays.toString(swappedArray));
    }

    private static int[] swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;

        return arr;
    }

}
