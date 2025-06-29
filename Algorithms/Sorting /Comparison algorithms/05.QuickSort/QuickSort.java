package quicksort;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void quickSort(int[] array, int start, int end) {

        if (end <= start) {
            return; // base case 
        }

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end ; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);
        return i; // this is the location of our pivot 
    }

}
