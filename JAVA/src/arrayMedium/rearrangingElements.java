package arrayMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rearrangingElements {
    public static int[] function(int[] arr){
        int[] res = new int[arr.length];
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                res[posIndex] = arr[i];
                posIndex += 2;
            }
            if (arr[i] < 0){
                res[negIndex] = arr[i];
                negIndex += 2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 4, -3, 7, -5, 2};
        int[] result = function(arr);
        System.out.println(Arrays.toString(result));
    }
}
