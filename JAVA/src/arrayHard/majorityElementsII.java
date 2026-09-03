package arrayHard;

import java.util.ArrayList;
import java.util.List;

public class majorityElementsII {
    public static List<Integer> function(int[] arr){
        int n = arr.length;
        List<Integer> elements = new ArrayList<>();
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
           if (count1 == 0 && element2 != arr[i]){
               count1 = 1;
               element1 = arr[i];
           } else if (count2==0 && element1 != arr[i]){
               count2 = 1;
               element2 = arr[i];
           } else if (arr[i] == element1){
               count1++;
           } else if (arr[i] == element2){
               count2++;
           } else {
               count1--;
               count2--;
           }
        }
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == element1) cnt1++;
            if(arr[i] == element2) cnt2++;
        }

        int mini = n / 3 + 1;
        if(cnt1 >= mini) elements.add(element1);
        if(cnt2 >= mini) elements.add(element2);
        return elements;

    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        List<Integer> result = function(arr);

        System.out.println(result);
    }
}
