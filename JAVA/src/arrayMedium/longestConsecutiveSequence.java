package arrayMedium;

import java.util.HashSet;

public class longestConsecutiveSequence {
    public static int function(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        if(arr.length == 0) return 0;
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i]-1)){
                int cnt = 1;
                int x = arr[i];
                while (set.contains(x+1)){
                    x += 1;
                    cnt +=1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr  = {100, 4, 200, 1, 3, 2};
        int result = function(arr);
        System.out.println(result);
    }
}
