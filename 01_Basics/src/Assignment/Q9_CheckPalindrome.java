package Assignment;

public class Q9_CheckPalindrome {
    public static void main(String[] args) {
        String str = "Racecar";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome2(str));

    }

    private static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    private static boolean checkPalindrome2(String str) {
        str = str.toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
