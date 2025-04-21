package check;

import java.util.Scanner;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with parentheses: ");
        String input = scanner.nextLine();

        if (checkParentheses(input)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("Error: Mismatched or missing parentheses.");
        }
    }

    public static boolean checkParentheses(String str) {
        int count = 0; // To count open parentheses

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                count++; // Increment for open parenthesis
            } else if (ch == ')') {
                count--; // Decrement for close parenthesis

                // If count becomes negative, there is a closing parenthesis without a matching
                // open one
                if (count < 0) {
                    System.out.println("Error: Extra closing parenthesis at index " + i);
                    return false;
                }
            }
        }

        // If count is not zero, we have unmatched open parentheses
        if (count != 0) {
            System.out.println("Error: Missing closing parenthesis.");
            return false;
        }

        return true; // Parentheses are balanced
    }
}
