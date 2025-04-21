import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int A[] = {4, 21, 1, 9, -12, 5, 32, 2, 6};

        System.out.println("Array before sorting : " + Arrays.toString(A));

        int n = A.length;

        for (int i = 1; i < n; i++) {

            int j = i - 1;
            int key = A[i];

            while (j >= 0 && A[j] > key) {
                //Shifting 
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
        
        System.out.println("Array after Sorting: " + Arrays.toString(A));     
    }

}
