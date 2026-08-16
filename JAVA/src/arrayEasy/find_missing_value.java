package arrayEasy;

import java.util.HashSet;

public class find_missing_value {
    public static int missingNum(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for (int i = 1; i <= arr.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int ans = missingNum(arr);
        System.out.println(ans);
    }
}
