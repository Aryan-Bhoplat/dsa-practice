package arrayEasy;

import java.util.Arrays;

public class movingZeroes {
    static void function(int[] arr){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
               j = i;
               break;
            }
        }
        if(j == -1){
            return;
        }
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        function(arr);
    }
}
