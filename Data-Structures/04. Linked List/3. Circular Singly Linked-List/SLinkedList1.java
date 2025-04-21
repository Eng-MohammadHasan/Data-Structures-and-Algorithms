/** Singly linked list Unorder List Dummy Circular.*/
public class SLinkedList1 {
  protected Node head;
  protected int size;
/*********************/
  public SLinkedList1() {
    head = new Node();head.next=head;
    size = 0;
  }
/*********************/
  public int length() {
    Node c = head.next;
    int count = 0;
    while (c != head) {
       count++;
       c = c.next;
    }
    return count;  }
/*********************/
  public boolean isEmpty() { return head.next==head; }
/*********************/
  public void addFirst(int e) {
    Node n = new Node(e);
  	n.next=head.next;
  	head.next=n;
    size++;    }
/*********************/
  public void delFirst() {
  	if (isEmpty()) System.out.println("Nothing to Delete"); 
  	else {
  		head.next=head.next.next;
  		size--;
  	}
}
/*********************/
  public void addLast(int e) {
  	Node n = new Node(e);
    Node c = head.next;
    Node prev=head ;
    while (c != head){
       prev = c;
       c = c.next;
   }
   prev.next= n;
   n.next=head;
   
    size++; 
  }
/*********************/
  public void delLast() {
  	if (!isEmpty()){
  		Node c = head.next;
  		Node prev = head;
  		while (c.next != head){
  			prev=c;
  			c = c.next;
  		}
  		prev.next=head;
  		size--;
  	}
  	else
  		System.out.println("Nothing to Delete"); 
  }
/*********************/
  public int getFirst() {
    if (head.next == head){
    	System.out.println("Nothing to return"); 
       return -1;
    }
    else
       return head.next.element;
  }
/*********************/
  public int getLast() {
    if (isEmpty()){
    	System.out.println("Nothing to return"); 
       return -1;
    }
    else {
       Node c = head.next;
       while (c.next != head)
          c = c.next;
       return c.element;
    }
  }
/*********************/
  public String toString() {
    String result = "==========\n";
    Node c = head.next;
    while (c != head) {
       result = result + c.element + "\n";
       c = c.next;
    }
    return result;
  }
 /*********************/
  public boolean find(int n)
  {
  	Node c;
  	for(c=head.next;c!=head;c=c.next)
  	{
  		if (c.element==n)
  			return true;
  	}
  	return false;
  }
 /*********************/
 public void delIn(int n)
 {	
  	Node c=head.next;
  	Node prev=head;
  	while (c != head){
  		if (c.element==n)
  			break;
		else {
  			prev=c;
  			c = c.next;
  		}
  	}
  	if (c != head){ //found
  		prev.next=c.next;
  		size--;
  	}
  	else
  		System.out.println("Nothing to Delete"); 
 }
 
 
 }
  


