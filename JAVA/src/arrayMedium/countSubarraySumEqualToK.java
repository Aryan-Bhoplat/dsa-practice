package arrayMedium;

import java.util.HashMap;

public class countSubarraySumEqualToK {
    public static int function(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            for (int j = i; j < arr.length; j++) {
                tempSum += arr[j];
                if (tempSum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int result = function(arr,6);
        System.out.println(result);
    }
}
