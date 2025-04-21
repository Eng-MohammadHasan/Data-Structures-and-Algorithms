package cdll;

public class Main {
    public static void main(String[] args) {
        Circular_Doubly_LL list = new Circular_Doubly_LL();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addIn(25, 3);

        System.out.println("Displaying list:");
        list.display();

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.delIn(3);
        System.out.println("After deleting at position 3:");
        list.display();

        list.delFirst();
        System.out.println("After deleting first element:");
        list.display();

        list.delLast();
        System.out.println("After deleting last element:");
        list.display();

        System.out.println("Searching for 20: " + list.search(20));
        System.out.println("Searching for 10: " + list.search(10));
    }
}
