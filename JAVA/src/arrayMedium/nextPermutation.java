package arrayMedium;

import java.util.Arrays;

public class nextPermutation {
    public static int[] function(int[] arr){
        int pivot = -1;
        int end = arr.length-1;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i-1] < arr[i]){
                pivot = i-1;
                break;
            }
        }
        if(pivot == -1){
            int start = 0;
            while (start < end ){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        } else {
            for (int i = arr.length - 1; i > 0; i--) {
                if( arr[i] > arr[pivot]){
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }

            while (pivot < end ){
                int temp = arr[pivot+1];
                arr[pivot+1] = arr[end];
                arr[end] = temp;
                pivot++;
                end--;

            }
        }



        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] result = function(arr);
        System.out.println(Arrays.toString(result));
    }

}
