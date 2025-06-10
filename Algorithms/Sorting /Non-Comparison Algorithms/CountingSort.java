public class CountingSort {

    // Function to perform Counting Sort
    public static void countingSort(int[] arr) {
        if (arr.length == 0)
            return;

        // Step 1: Find the maximum value
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }

        // Step 2: Initialize count array
        int[] count = new int[max + 1];

        // Step 3: Count frequencies
        for (int num : arr) {
            count[num]++;
        }

        // Step 4: Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // Function to print array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Before Sorting:");
        printArray(arr);

        countingSort(arr);

        System.out.println("After Counting Sort:");
        printArray(arr);
    }
}
