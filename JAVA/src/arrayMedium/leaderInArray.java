package arrayMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leaderInArray {
    public static List<Integer> function(int[] arr){
        List<Integer> res = new ArrayList<>();
        int max = arr[arr.length-1];
        res.add(max);
        for (int i = arr.length-2; i >=0; i--) {
            if (arr[i] > max){
                 res.add(arr[i]);
                 max = arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        List<Integer> result = function(arr);
        System.out.println(result);
    }
}
