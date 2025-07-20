package Assignment;

public class Q8_HCF_LCM {

    public static void main(String[] args) {
        int n1 = 12, n2 = 20;
        int hcf = hcfFunc(n1, n2);
        int lcm = lcmFunc(n1, n2);

        if (n1 * n2 == hcf * lcm) {
            System.out.println("LCM = " + lcm + "\nHCF = " + hcf);
        } else {
            System.out.println("Wrong HCF and LCM found.");
        }
    }

    private static int lcmFunc(int n1, int n2) {
        int lcm = n1 > n2 ? n1 : n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                return lcm;
            }

            lcm++;
        }
    }

    private static int hcfFunc(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
