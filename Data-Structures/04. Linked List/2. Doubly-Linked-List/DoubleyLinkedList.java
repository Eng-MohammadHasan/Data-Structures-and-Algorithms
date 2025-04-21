
package doubleylinkedlist;

public class DoubleyLinkedList {
public Node head;

public int size;

public DoubleyLinkedList( ){
    head=null;
    size=0;
}
public boolean isEmpty(){return head==null;}
public void addFirst(int value){
    Node x=new Node(value);
    
    if(! isEmpty()){
     x.next=head;
     head.prev=x;
     head=x;
     size++;
    }
    else
    {
      head=x;
      size++;
    
    }
}
public void addLast(int value)
{
  Node x=new Node(value);
  
  if(! isEmpty())
  {
  Node c=head;
  
  while(c.next!=null)
  {
    c=c.next;
  }
  c.next=x;
  x.prev=c;
  size++;
}
  else
  {
    head=x;
  
  }
} 


public void delFirst(){
if(isEmpty())
{
    System.out.println("nothing to delete ");
}
else if(head.next==null)
{
    head=null;

    size--;
 
}
else
{
    head=head.next;
    head.prev=null;
    size--;

}
}
public void delLast(){
if(isEmpty())
{  
    System.out.println("your list is empty");
}
else if(head.next==null)
{
  head=null;
  size--;
}
else
{
Node c=head;
  
   while(c.next !=null)
   { 
  
     c=c.next;
   }
 
   c.prev.next=null;
   c.prev=null;
   size--;

}

}
public void delAll(){
head=null;


}

void report(){
Node c=head;
    if(!isEmpty())
    {
while(c!=null)
{
    System.out.print(c.element+",");
    c=c.next;
}
    System.out.println("");
    }
    else
    {
        System.out.println("your list is empty");
    }
    


}

public int find(int value){
if(isEmpty())
{
  return -1;
}
else
{
  Node c=head;
  int count=1;
  while(c!=null)
  {
    if(c.element==value)
        return count ;
    count++;
    c=c.next;
  }
  return -1;

}
}

public void insert(int value,int loc)
{
  if(loc <=size&&loc>0)
  {
  Node x=new Node(value);
  Node c=head;
  int count=1;
  while (count <loc)
  {
    c=c.next;
    count++;
  }
    
  x.next=c;
  x.prev=c.prev;

  c.prev.next=x;
    c.prev=x;
  size++;
  }
  else
  {
      System.out.println("invalid loc");
  }
}
public void delIn(int loc)
{
  if(loc <=size&&loc>0)
  {

  if(loc==1)
  {
      delFirst();
  }
  else if(loc==size)
  {
      delLast();
      
  }
  else
  {
  Node c=head;
  int count=1;
  while (count <loc)
  {
    c=c.next;
    count++;
  }
 c.prev.next=c.next;
 c.next.prev=c.prev;
 size--;
  }
  }
  else
  {
      System.out.println("invalid loc");
  }


}

}
