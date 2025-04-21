package infix_algo;

public class InfixToPostfix {
    int Array[];
    char infix[];
    char posfix[];
    private int top;
    private int capacity;

    public InfixToPostfix(int capacity) {
        this.capacity = capacity;
        Array = new int[capacity];
        top = -1;
    }

    public InfixToPostfix() {
        this.capacity = 100; // default capacity
        infix = new char[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to return the number of elemnts in the stack :)
    public int length() {
        if (isEmpty()) {
            return -999999;
        } else {
            return top + 1;
        }
    }

    public void push(int value) {
        if (!isFull()) {
            top++;
            Array[top] = value;
        } else {
            System.out.println("The stack is full !");

        }
    }

    public int pop() {
        int x = -999999;
        if (isEmpty()) {
            System.out.println("The stack is empty !");
        } else {
            x = Array[top];
            top--;
        }
        return x;
    }

    // Peak ... Returns the top element on the Stack ,
    // but doesn't remove it from the Stack :>
    public int peak() {
        int x = -9999999;
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            x = Array[top];
        }
        return x;
    }

    // Helper method to check operator precedence
    private int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    // Method to convert infix to postfix -->
    public String infixToPostfix(String expression) {

        char[] result = new char[capacity]; // Array to store postfix expression
        int resultIndex = 0; // Index for result array

        char[] stack = new char[capacity]; // Stack to store operators
        int stackTop = -1; // Top index of the stack

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is an operand, add it to the result
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                result[resultIndex++] = ch;
            }

            // If the character is '(', push it to the stack
            else if (ch == '(') {
                stack[++stackTop] = ch;
            }
            // If the character is ')', pop and output until '(' is encountered
            else if (ch == ')') {
                while (stackTop != -1 && stack[stackTop] != '(') {
                    result[resultIndex++] = stack[stackTop--];
                }
                if (stackTop != -1 && stack[stackTop] == '(') {
                    stackTop--; // Pop the '('
                }
            }
            // Operator
            else {
                while (stackTop != -1 && precedence(stack[stackTop]) >= precedence(ch)) {
                    result[resultIndex++] = stack[stackTop--];
                }
                stack[++stackTop] = ch;
            }
        }
        // Pop all the operators from the stack
        while (stackTop != -1) {
            result[resultIndex++] = stack[stackTop--];
        }
        // Manually build a String using a loop
        String postfix = "";
        for (int i = 0; i < resultIndex; i++) {
            postfix += result[i];
        }
        return postfix;
    }
}
