package linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList obj1 = new SinglyLinkedList();
        obj1.addFirst(3);
        obj1.addFirst(33);
        obj1.addFirst(63);
        System.out.println(obj1.find(63));
    }
}
