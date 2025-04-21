
package uda;

// Unordered dynamic Array
public class UDA {
    private int A[];
    private int size;
    private int cap;
    
    public UDA(int cap)
    {
        A=new int [cap];
        size=0;
        this.cap=cap;

    }
   public boolean isEmpty(){return size==0;}
   public boolean isFull(){return size==cap;}
    public void Add(int item )
    {
      if(isFull())
      {
          // زيادة الحجم الكلي 
          cap=cap+10;
          //انشاء مصفوفة جديدة
          int B[]=new int[cap];
          //نسخ العناصر من المصفوفة القديمة للجديدة
         for(int i=0;i<size;i++)
         {
         B[i]=A[i];
         }
         A=B;    
      }
      A[size]=item;
      size++;
    
    }
    public void addFirst(int item )
    {
        if(isFull())
        {
            cap=cap+10;
            int B[]=new int[cap];
            for(int i=0;i<size;i++)
            {
            B[i]=A[i];
            }
            A=B;
        }
        A[size]=A[0];
        A[0]=item;
        size++;
    
    }
    public void addAt(int index,int item)
    {
      if(index >size|| index<0)
      {
          System.out.println("out of range");
      }
      else
      {
          if(isFull())
          {
                cap=cap+10;
            int B[]=new int[cap];
            for(int i=0;i<size;i++)
            {
            B[i]=A[i];
            }
            A=B;
          }
          A[size]=A[index];
          A[index]=item;
          size++;
      }
    }
   // 1- delfirst()
   // 2- delLast()
   // 3- del(item )
   // 4-delAt(index)
   // 5- delAll()
   // 6- find ()
   // 7- report ()
    
    
    
}
