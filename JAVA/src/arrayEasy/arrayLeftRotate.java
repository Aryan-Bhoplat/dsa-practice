package arrayEasy;

import java.util.Arrays;

public class arrayLeftRotate {
    static void function(int[] arr){
        if(arr.length <= 1){
            return;
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        function(arr);
        System.out.println(Arrays.toString(arr));
    }
}
