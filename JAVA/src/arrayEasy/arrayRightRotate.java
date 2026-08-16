package arrayEasy;

import java.util.Arrays;

public class arrayRightRotate {
    static void function(int[] arr){
        if(arr.length <= 1){
            return;
        }
        int last = arr[arr.length-1];
        for (int i = arr.length-1; i >= 1; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        function(arr);
        System.out.println(Arrays.toString(arr));
    }
}
