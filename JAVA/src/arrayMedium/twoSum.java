package arrayMedium;

import java.util.*;

public class twoSum {
    public static int[] function(int[] arr,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,6,7,3,9};
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        int[] result = function(arr,target);
        System.out.println(Arrays.toString(result));
    }

}
