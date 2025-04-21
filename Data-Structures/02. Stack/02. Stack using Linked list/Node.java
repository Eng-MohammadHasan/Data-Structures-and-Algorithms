
public class Node
{
	public char element;
	public Node Next;
	
	public Node() { element=' '; Next=null; }
	
	public Node(char e)
	{
		this.element=e;
		this.Next=null;
	}
}