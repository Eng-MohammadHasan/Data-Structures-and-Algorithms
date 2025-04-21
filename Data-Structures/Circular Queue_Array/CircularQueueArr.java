package Queue;

public class CircularQueueArr {
    int Array[];
    int front, rear, size, capacity;

    public CircularQueueArr(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
        size = 0;
        Array = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enque(int element) {
        if (isFull()) {
            System.out.println("Queue is Full !");
        } else {
            if (rear == (capacity - 1)) {
                rear = 0; // Reset directly to 0 for clarity
            } else {
                rear++;
            }
            Array[rear] = element;
            System.out.println("The element " + element + " is inserted in index " + rear);
            size++;
        }
    }

    public int dequeue() {
        int temp = -99999999;
        if (isEmpty()) {
            System.out.println("Queue is Empty !");
        } else {
            temp = Array[front];
            if (front == (capacity - 1)) {
                front = 0;
            } else {
                front++;
            }
            size--;
        }
        return temp;
    }
}
