
public class Node {
  public int element;
  public Node next;
  public Node() {
    this(0, null);
  }
  public Node(int e, Node n) {
    element = e;
    next = n;
  }
  public Node(int e) {
     element = e;     
     next = null;
   }

  
}
