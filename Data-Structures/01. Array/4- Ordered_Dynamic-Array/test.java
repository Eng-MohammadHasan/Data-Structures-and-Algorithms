
public class test
{
	public static void main (String args[])
	{
		OrderedDynamicArray a = new OrderedDynamicArray(3);
		a.add(2);
		a.add(0);
		a.add(1);
		a.add(3);
		a.report();
		a.del(3);a.report();
		a.delLast();a.report();
		a.del(2);a.report();
		a.del(0);a.report();

	
		
		
	}
}