package sorting;
//Chooses a pivot, places smaller elements before it and larger elements after it, then recursively sorts both sides.
import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1,high);
        }

    }

    static int partition(int[] arr,int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if( arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};
        System.out.println("Before: "+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("After: "+Arrays.toString(arr));
    }
}
