public class QueueL {
	private Node h;
	private Node t;
	private int size;
	
	public QueueL(){
		h=t=null;
		size=0;
	}
	public boolean isEmpty(){
		if ( h==null&&t==null )
		return true;
		else
		return false;
	}
	
	public boolean isFull()	{
		return false;
	}
	public boolean isOne()	{
		if ( h==t )
		return true;
		else
		return false;
	}

	
	public void enq(char obj)	{
		Node z=new Node(obj);
		if ( !isEmpty() )		{
			t.Next=z;
			t=t.Next;
		}
		else		{
			h=z;
			t=z;
		}
	}
	public char deq()	{
		char z=' ';
		if ( !isEmpty() )		{
			z=h.element;
			h=h.Next;
		}
		else
		System.out.println ("Empty");
		
		if ( h==null )		t=null;
		
		return z;
	}
	
	public char front()	{
		char z=' ';
		if ( !isEmpty() )		{
			z=h.element;
		}
		else
		System.out.println ("Empty");
		return z;
	}
	
	public String toString()	{
		String s="";
		for ( Node k=h;k!=t.Next;k=k.Next){
			s=s+k.element+"\n";
		}
		return s;
	}
}
