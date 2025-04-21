package stack_array;

public class Main1 {
    public static void main(String[] args) {
        String expression = "(A + B *(C - D) ";

        StackUsingArray object1 = new StackUsingArray(5);

        if (object1.checkInput(expression)) {
            System.out.println("The expression is correct");
        } else {
            System.out.println("Syntax error ! missing ' ) ' in the end of the expression");
        }
    }
}
