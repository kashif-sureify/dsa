package Assignment;

public class Q7_LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        System.out.println(checkLeapYear(year));
    }

    private static boolean checkLeapYear(int year) {
        return (year % 100 != 0 && year % 4 == 0 || year % 400 == 0);
    }
}
