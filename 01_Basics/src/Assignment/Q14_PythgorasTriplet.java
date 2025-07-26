package Assignment;

public class Q14_PythgorasTriplet {
    public static void main(String[] args) {
        System.out.println(pythagorasTriplet(3, 4, 5));
    }

    private static boolean pythagorasTriplet(int i, int j, int k) {
        if (i * i + j * j == k * k) {
            return true;
        }

        return false;
    }
}
