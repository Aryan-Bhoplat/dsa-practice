package arrayMedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class revision {
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];
            if (map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(arr[i],i);

        }
        return new int[]{};
    }

    public static int[] sortArrayOf012(int[] arr){
        int n = arr.length;
        int low = 0,mid = 0;
        int high = n - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low ++;
                mid ++;
            } else if (arr[mid] == 1){
                mid++;
            } else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
        return arr;
    }

    public static int majorityElement(int[] arr){
        int count = 0;
        int candidate = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(count == 0){
                candidate = arr[i];
            }
            if(arr[i] == candidate){
                count++;
            } else {
                count--;
            }

        }
        int cnt = 0;
        for(int i: arr){
            if(i == candidate){
                cnt++;
            }
        }
        if(cnt > n/2)
            return candidate;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,5};
        int[] result = twoSum(arr,13);
        System.out.println(Arrays.toString(result));

        int[] arr2 = {2,1,0,2,1};
        int[] result2 = sortArrayOf012(arr2);
        System.out.println(Arrays.toString(result2));

        int[] arr3 = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int result3 = majorityElement(arr3);
        System.out.println(result3);

    }
}
