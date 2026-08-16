package sorting;

import java.util.Arrays;

public class recursiveInsertionSort {
    static void insertionRec(int[] arr, int n){
        if (n <= 1){
            return;
        }
        insertionRec(arr, n - 1);

        // Insert last element at its correct position
        int key = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        System.out.println(Arrays.toString(arr));
        insertionRec(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
