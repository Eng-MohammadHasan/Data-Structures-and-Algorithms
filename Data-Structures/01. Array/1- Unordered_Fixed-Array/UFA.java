package ufa;

public class UFA {

    private int A[];
    private int cap; // الحجم الكلي
    private int size;// الحجم الفعلي+مؤشر لاخر موقع فارغ

    // constructor
    public UFA(int cap) {
        A = new int[cap];
        size = 0;
        this.cap = cap;
    }

    // methods
    public boolean isFull() {
        if (size == cap) {
            return true; // مليانة
        } else {
            return false; // مش مليانة

        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;// فاضية
        } else {
            return false;// مش فاضية

        }
    }

    // method to display the array values
    public void report() {
        for (int i = 0; i < size; i++) {
            System.out.print(A[i] + ",");
        }
    }

    public void Add(int x) {

        if (isFull()) {
            System.out.println("sorry , full");
        } else {
            A[size] = x;
            size++;
            System.out.println("ok");
        }

    }

    // Method to search a certain value and return its index :>
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (A[i] == value) {
                return i;// return the index of the value
            }
        }
        return -1; // if the value is not found in the array, return -1
    }

    public void addFirst(int value) {
        if (isFull()) {
            System.out.println("sorry , full");
        } else {
            A[size] = A[0];
            A[0] = value;
            size++;
        }
    }

    // Another (way) method to add first
    public void addFirst_Shift(int number) {
        for (int i = size; i > 0; i--) {
            A[i] = A[i - 1]; // shift all elements to the right
        }
        size++;
        A[0] = number;
    }

    // public boolean delete(int num) {
    // // calling the search method to get the index of the number
    // if(search(num) == -1){
    // return false;
    // }
    // else{
    // A[i] = A[size - 1];
    // size--;
    // return true;
    // }
    // }
    // }return false;}
    // This delete method is taking the last element and replacing it with the element to be deleted (User gives the number not index !)
    public boolean delete(int numb) {
        int searchResult = search(numb);
        /*
         * the searchRuslt carries the return value (-1) if the value doesn't exist , or
         * carries
         * the value itself :>
         */
        if (searchResult == -1) {
            return false; // false means that the value (numb) doesn't exist !
        } else {
            /*
             * else here means that the searchResult carries
             * the value itself (not -1)
             */
            A[searchResult] = A[size - 1];
            size--;
            return true;

        }
    }

    // This method is taking an index and deleting the value of that index :> (User gives the index not the value !)
    public void deleteIn(int index) {
        if (isEmpty()) {
            System.out.println("The list is empty");
        } else {
            if (index >= 0 && index < size) {
                for (int i = index; i < size - 1; i++) { // shifting all elements to the left   
                    A[i] = A[i + 1];
                }
                size--;
            } else {
                System.out.println("Index " + index + " is out of pound");
            }

        }
    }

    public void deleteFirst_Shifting() {
        if (isEmpty()) {
            System.out.println("sorry the array is empty :> ");
        } else {
            for (int i = 0; i < size - 1; i++) {
                A[i] = A[i + 1]; // shift all elements to the left

            }
            size--;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("The array is Empty");
        } else {
            size--;
        }
    }

}
