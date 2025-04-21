package Queue;

public class QueueUsingArray {
    int[] Array;
    int size, capacity, front, rear;

    public QueueUsingArray(int capacity) {

        this.capacity = capacity;
        Array = new int[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return (front > rear);
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    public void enque(int element) {
        if (isFull()) {
            System.out.println("Queue is Full !");
        } else {
            rear++;
            Array[rear] = element;
            size++;
        }
    }

    public int deque() {
        int temp = -999999;
        if (isEmpty()) {
            System.out.println("Queue is Empty !");
        } else {
            temp = Array[front];
            front++;
            size--;
        }
        return temp;
    }
}