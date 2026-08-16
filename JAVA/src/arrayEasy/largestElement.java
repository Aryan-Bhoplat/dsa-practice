package arrayEasy;

import java.util.Arrays;

public class largestElement {

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4,6,8};
        int max = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int j = 1;j < arr.length;j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("Largest: "+max);
    }
}
