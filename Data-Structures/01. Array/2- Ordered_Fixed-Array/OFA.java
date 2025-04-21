package ofa;

public class OFA {
    private int capacity;
    private int size;
    private int Array[];

    public OFA(int capacity) {
        this.capacity = capacity;
        Array = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity; // this is not a normal equal , we're not assinging
                                 // a value here no ! , we are comparing here !
    }

    public void addIn(int number) {
        if (isFull()) {
            System.out.println("Sorry ,The Array list is Full !");
        } else {
            // This variable represents the location that I want to add in !!!!!
            int var = 0; // bear in mind also here i put the (var = 0) so if the array
                         // is empty it's going to the entered number to the index zero !
            // this loop is for searching
            for (int i = 0; i < size; i++) {
                if (number < Array[i]) {
                    // var = i;
                    break; // break the loop
                }
                var++; // increment each iteration :)
            }
            // this loop is for shifting the values
            for (int j = size; j > var; j--) {
                Array[j] = Array[j - 1];
            }
            Array[var] = number;
            size++;
        }
    }

    // this method takes the location (index) from main ,
    // and delete the value of this index :)
    public void deleteAt(int index) {
        if (isEmpty()) {
            System.out.println("Sorry , The Array list is Empty !");
        } else {
            if (index >= 0 && index < size) {
                for (int i = index; i < size - 1; i++) {
                    Array[i] = Array[i + 1];
                }
                size--;
                System.out.println("The item deleted successfully :> ");
            } else {
                System.out.println("invalid input ! out of range ");
            }
        }
    }

    public int find(int number) {
        for (int i = 0; i < size; i++) {
            if (Array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public void deleteIn(int value) {
        if (isEmpty()) {
            System.out.println("Sorry , The Array list is Empty !");
        } else {
            int valueIndex = find(value);
            if (valueIndex == -1) {
                System.out.println("The value doesn't exist !! ");
            } else {
                // this else , it means that the value exist

                // deleteAt(valueIndex);
                for (int i = valueIndex; i < size - 1; i++) {
                    Array[i] = Array[i + 1];
                }
                size--;
                System.out.println("The item deleted successfully :> ");
            }
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Sorry , The Array list is Empty !");
        } else {
            for (int i = 0; i < size - 1; i++) {
                Array[i] = Array[i + 1];
            }
            size--;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("Sorry , The Array list is Empty !");
        } else {
            size--;
        }

    }

    public int replace(int index, int value) {
        // int temp;
        if (index >= 0 && index < size) {
            int temp = Array[index];
            Array[index] = value;
            return temp;
        } else {
            System.out.println("Index " + index + "out of bound ! ");
            return -999999999;
        }
    }

    public void report() {
        for (int i = 0; i < size; i++) {
            System.out.print(Array[i] + " , ");
        }
    }

    public int binarySearch(int number) {
        int low = 0;
        int high = size - 1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (Array[mid] == number) {
                return mid; // best case :>
            } else if (Array[mid] < number) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -999999;
    }

    public void bubbleSort() {
        int temp = 0;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < (size - i); j++) {
                if (Array[j] > Array[j + 1]) {

                    // swap elements :>
                    temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
            }
        }
    } // The End :>
}