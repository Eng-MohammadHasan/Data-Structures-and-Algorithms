public class OrderedDynamicArray  {
  private int[] A;	      
  private int capacity = 3;  
  private int size = 0;	     
  /*****************************/
  public OrderedDynamicArray(int c) {
  	capacity = c;
  	size=0;
  	A = new int[capacity];   
  }
  /*****************************/
  public boolean isEmpty() {   return size == 0;   }
  public boolean isFull() {   return size == capacity;   }
  /***************************** */
  public void report()
  {
  	System.out.println("---");
  	for(int i =0;i<size;i++)
  	System.out.println(A[i]);
  	System.out.println("---");
  }
  /***************************** */
  public void add(int x)
  {
  	//1- increase size
  	if (isFull()){
      capacity *= 2;
      int[] B = new int[capacity];
      for (int i=0; i<size; i++) 
      	B[i] = A[i];
      A = B;
  	}
  	//2- search for location
  	int i=0;
  	while (i<size)
  	{
  		if (A[i]>x)
  			break;
  		i++;
  	}
  	//3- shift elements up
 	for (int k=size-1; k>=i; k--)	
      A[k+1] = A[k];

   //4- add
   A[i] = x;
   size++;
  }
  
  /***************************** */
  public void delFirst()
  {
  	//HW
  }
  public void delLast()
  {
  	if (!isEmpty())
  	{
  		size--;
  	}
  }
  public void del(int x)
  {
  	int z= find (x);
  	if (z==-1)
  		System.out.println("Not Found");
  	else
  	{
  		for (int i=z+1; i<size; i++)	// shift elements down
      		A[i-1] = A[i];
    	size--;		
  	}
  }
  /***************************** */
  public int find(int n)
  {
    int lo=0;
  	int hi=size-1;
  	while(lo<=hi)
  	{
  		int mid = (lo+hi)/2;
  		if (A[mid]==n) 
  		return mid;
  		else if (A[mid]<n)
  		lo= mid+1;
  		else
  		hi = mid-1;
  	}
  	return -1; 	
  }
 
}