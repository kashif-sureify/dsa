package Assignment;

public class Q1_Largest {
    public static void main(String[] args) {
        int a = 263;
        int b = 86;
        int c = 803;

        int max = findLargest(a, b, c);

        System.out.println(max);
    }

    private static int findLargest(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        return max;
    }
}
