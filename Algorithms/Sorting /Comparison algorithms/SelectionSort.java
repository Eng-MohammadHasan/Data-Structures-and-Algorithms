package selectionsort;

public class SelectionSort {

    // Print array elements
    public static void printArrayContent(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); // newline for clarity
    }

    // Perform selection sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;

            // Find index of the minimum element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // Swap if a smaller element was found
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 0, 2, 10 , 5 , 100 , 3 , 6 , 78 };

        selectionSort(arr);          // Sort the array
        printArrayContent(arr);      // Print sorted array
    }
}
