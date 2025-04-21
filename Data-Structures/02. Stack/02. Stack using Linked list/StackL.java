
public class StackL
{
	private Node top;
	private int size;
	
	
	public StackL()
	{
		top=null;
	}
	
	public boolean isFull()
	{
		return false;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void push(char obj)
	{
		Node z=new Node(obj);
		z.Next=top;
		top=z;
		size++;
	}
	
	public char pop()
	{
		char x=' ';
		if ( !isEmpty() )
		{
			x=top.element;
			top=top.Next;
			size--;
		}
		else
		System.out.println ("Empty");
		
		return x;
	}
	
	public char front()
	{
		if ( !isEmpty() )
		return top.element;
		else
		{
			System.out.println ("Empty");
			return ' ';
		}
	}
	
	public String toString()
	{
		String s="";
		int i=0;
		for(Node k=top;k!=null;k=k.Next)
		{
			s=s+(i+1)+"-"+k.element+"\n";
			i++;
		}
		
		return s;
	}
}
