package stack_array;

public class StackUsingArray {
    private int Array[];
    private int top;
    private int capacity;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        Array = new int[capacity];
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
    // Peak ... Returns the top element on the Stack , but doesn't remove it from the Stack :> 
    public int peak() {
        int x = -999999999;
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            x = Array[top];
        }
        return x;
    }

    public void checkInput(){
        String userInput = "(A + B ";
        
        for (int i = 0; i < userInput.length(); i++) {
            if(userInput.charAt("("){

        } 
        }
       
    }

}
