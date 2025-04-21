package infix_algo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create an object of InfixToPostfix
        InfixToPostfix exp = new InfixToPostfix();

        // Ask the user for the infix expression
        System.out.println("Enter the infix expression: ");
        // A+B*(C-D)
        String infixExpression = in.nextLine(); // Read the entire line of input

        // Convert the infix expression to postfix
        String postfixExpression = exp.infixToPostfix(infixExpression);

        // Display the postfix expression
        System.out.println("Postfix Expression: " + postfixExpression);
        // ABCD-*+
    }
}
