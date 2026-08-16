package arrayMedium;

import java.util.Arrays;

public class sortArray {
    public static int[] function(int[] arr){
        int low = 0, mid = 0;
        int high = arr.length -1;

        while (mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1){
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={2,1,0,1,2};

        int[] result = function(arr);
        System.out.println(Arrays.toString(result));

    }
}
