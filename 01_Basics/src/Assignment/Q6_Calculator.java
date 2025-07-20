package Assignment;

import java.util.Scanner;

public class Q6_Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int ans = 0;
            while (true) {
                System.out.println("Enter the operator: ");
                char op = sc.next().trim().charAt(0);
                // System.out.println();
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    System.out.println("Enter two numbers: ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    // System.out.println();

                    
                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    if (op == '*') {
                        ans = num1 * num2;
                    }

                    if (op == '%') {
                        ans = num1 % num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        }

                    }

                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid operator !!");
                }
                System.out.println(ans);
            }
        }

    }
}
