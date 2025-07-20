package Assignment;

public class Q4_CountOccurence {
    public static void main(String[] args) {
        int a = 5;
        double n = 125895145518555L;

        int count = countOccuerence(a, n);
        System.out.println(count);
    }

    private static int countOccuerence(int a, double n) {
        int count = 0;
        while (n > 0) {
            int digit = (int) (n % 10);
            if (digit == a) {
                count++;
            }
            n = n / 10;

        }
        return count;
    }
}
