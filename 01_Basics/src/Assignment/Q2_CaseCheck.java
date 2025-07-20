package Assignment;

public class Q2_CaseCheck {
    public static void main(String[] args) {
        String s = "Hello";

        char ch = s.charAt(0);
        

        if (ch >= 65 && ch <= 90) {
            System.out.println("Uppercase");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("Lowercase");
        } else {
            System.out.println("not an alphabet");
        }

        // if (ch >= 'a' && ch <= 'z') {
        //     System.out.println("LowerCase");
        // } else if (ch >= 'A' && ch <= 'Z') {
        //     System.out.println("Uppercase");
        // } else {
        //     System.out.println("Not a alphabet");
        // }
    }
}
