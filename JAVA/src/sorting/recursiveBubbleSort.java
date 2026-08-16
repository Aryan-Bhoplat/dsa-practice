package sorting;

import java.util.Arrays;

public class recursiveBubbleSort {
    static void bubbleRec(int[] arr, int n){
        if (n == 1){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleRec(arr,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        System.out.println(Arrays.toString(arr));
        bubbleRec(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
