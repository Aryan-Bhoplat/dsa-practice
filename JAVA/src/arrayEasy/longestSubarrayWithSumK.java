package arrayEasy;

import java.util.HashMap;

public class longestSubarrayWithSumK {
    public static int longSubArray(int[] arr,int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k){
                maxLen = i+1;
            }
            if (map.containsKey(sum)){
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1,-1,5,-2,-3};
        int result = longSubArray(arr,3);
        System.out.println(result);
    }
}


// Brute Force
//        int Len = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if(sum == k){
//                    Len = Math.max(Len,j-i+1);
//                }
//            }
//        }
//        return Len;