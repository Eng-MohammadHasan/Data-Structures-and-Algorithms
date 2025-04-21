package linkedlist;

public class SinglyLinkedList {
    private node head;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
        // here the head still just a reference (pointer) :)
        // to create the beginning of the list :)
        this.head = null; // still null (doesn't have an andress)
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int value) {
        node z = new node(value);
        // z.setNext();
        z.next = head;
        head = z;
        size++;
    }

    public void deleteFirst() {
        if (!isEmpty()) {
            head = head.next;
            size--;
        } else {
            System.out.println("The linked list is empty !");
        }
    }

    public void addlast(int value) {
        node x = new node(value);
        node ptr = head; // pointer (it's just a reference witout creating the object)
        if (!isEmpty()) {
            while (ptr.next != null) {
                ptr = ptr.next; // we're looping using this statement :)
            }
            ptr.next = x;
            size++;
        } else {
            head = x;
            size++;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("The list is empty !");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            node ptr = head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            ptr.next = null;
            size--;
        }
    }

    public int find(int value) {
        if (!isEmpty()) {
            node ptr = head;
            int count = 0;
            while (ptr != null) {
                count++;
                if (ptr.element == value) {
                    return count;
                }
                ptr = ptr.next;
            }
            return -999999;
        } else {
            return -1;
        }
    }

    public int getFront() {
        if (!isEmpty()) {
            return head.element;
        }
        return -99999;
    }

    public int getLast() {
        if (!isEmpty()) {
            node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            return ptr.element;
        } else {
            return -999999;
        }

    }

    public void deleteAll() {
        head = null;
    }

    public void addIn(int x, int e) { // add e after x
        node n = new node(e);
        node ptr = head;
        while (ptr != null) {
            if (ptr.element == x) {
                break;
            } else {
                ptr = ptr.next;
            }

        }
    }
}
