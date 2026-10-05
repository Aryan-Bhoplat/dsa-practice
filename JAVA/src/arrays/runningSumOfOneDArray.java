package arrays;

import java.util.Arrays;

public class runningSumOfOneDArray {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};
        int[] result = runningSum(arr);
        System.out.println(Arrays.toString(result));
    }

}
