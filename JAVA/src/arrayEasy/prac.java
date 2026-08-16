package arrayEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class prac {
    public static int function(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int i: arr) {
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
    public static List<Integer> function2(int[] arr1, int[] arr2){
        List<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;
        while (i < n && j < m){
            if (arr1[i] < arr2[j]){
                if (Union.isEmpty() || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }
            else if (arr1[i] > arr2[j]){
                if (Union.isEmpty() || Union.get(Union.size()-1) != arr2[j]){
                    Union.add(arr2[j]);
                }
                j++;
            }
            else{
                if (Union.isEmpty() || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n){
            if (Union.isEmpty() || Union.get(Union.size()-1) != arr1[i]){
                Union.add(arr1[i]);
            }
            i++;
        }
        while ( j < m){
            if (Union.isEmpty() || Union.get(Union.size()-1) != arr2[j]){
                Union.add(arr2[j]);
            }
            j++;
        }
        return Union;
    }
    public static int function3(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for( int i: arr){
            set.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
    public static int function4(int[] arr){
        int count = 0, maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
            } else{
                count = 0;
            }
            maxi = Math.max(maxi, count);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,1,4,4};
        int result = function(arr);
        System.out.println(result);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        List<Integer> finalUnion = function2(arr1, arr2);
        System.out.println(finalUnion);
    }
}
