package arrayEasy;

import java.util.ArrayList;
import java.util.List;

public class unionOfArrays {
    public static List<Integer> function(int[] arr1, int[] arr2,int n,int m){
        int i = 0;
        int j = 0;
        List<Integer> Union = new ArrayList<>();

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                if(Union.isEmpty() || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if(Union.isEmpty() || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
            else{
                if(Union.isEmpty() || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < n){
            if(Union.isEmpty() || Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m){
            if(Union.isEmpty() || Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        System.out.println(function(arr1,arr2,arr1.length,arr2.length));
    }
}
