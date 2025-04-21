package cdll;

public class Circular_Doubly_LL {
    Node head;
    Node tail;
    int size;

    public Circular_Doubly_LL() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isOne() {
        return size == 1;
    }

    public int length() {
        return size;
    }

    public int getFirst() {
        if (isEmpty()) {
            System.out.println("Your list is empty! Nothing to get.");
            return -99999;
        }
        return head.data;
    }

    public int getLast() {
        if (isEmpty()) {
            System.out.println("Your list is empty! Nothing to get.");
            return -99999;
        }
        return tail.data;
    }

    public void delFirst() {
        if (!isEmpty() && !isOne()) {
            head = head.next;
            head.previous = tail;
            tail.next = head;
            size--;
        } else if (isOne()) {
            head = null;
            tail = null;
            size--;
        } else {
            System.out.println("Your list is empty! Nothing to delete.");
        }
    }

    public void delLast() {
        if (!isEmpty() && !isOne()) {
            tail = tail.previous;
            tail.next = head;
            head.previous = tail;
            size--;
        } else if (isOne()) {
            head = null;
            tail = null;
            size--;
        } else {
            System.out.println("Your list is empty! Nothing to delete.");
        }
    }

    public void delIn(int location) {
        if (location <= size && location > 0) {
            if (location == 1) {
                delFirst();
            } else if (location == size) {
                delLast();
            } else {
                Node temp = head;
                for (int i = 1; i < location; i++) {
                    temp = temp.next;
                }
                temp.previous.next = temp.next;
                temp.next.previous = temp.previous;
                size--;
            }
        } else {
            System.out.println("Invalid location!");
        }
    }

    public void addFirst(int element) {
        Node x = new Node(element);
        if (!isEmpty()) {
            x.next = head;
            head.previous = x;
            head = x;
            tail.next = x;
            x.previous = tail;
        } else {
            head = x;
            x.next = head;
            x.previous = head;
            tail = x;
        }
        size++;
    }

    public void addLast(int element) {
        if (!isEmpty()) {
            Node x = new Node(element);
            x.previous = tail;
            x.next = head;
            tail.next = x;
            head.previous = x;
            tail = x;
            size++;
        } else {
            addFirst(element);
        }
    }

    public void addIn(int element, int location) {
        if (location <= size && location > 0) {
            if (location == 1) {
                addFirst(element);
            } else if (location == size + 1) {
                addLast(element);
            } else {
                Node x = new Node(element);
                Node temp = head;
                for (int i = 1; i < location - 1; i++) {
                    temp = temp.next;
                }
                x.next = temp.next;
                x.previous = temp;
                temp.next.previous = x;
                temp.next = x;
                size++;
            }
        } else {
            System.out.println("Invalid location!");
        }
    }

    public boolean search(int element) {
        if (isEmpty()) {
            return false;
        }
        Node temp = head;
        do {
            if (temp.data == element) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}