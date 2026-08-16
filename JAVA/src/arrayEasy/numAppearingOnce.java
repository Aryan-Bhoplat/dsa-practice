package arrayEasy;

public class numAppearingOnce {
    public static int function(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1) return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,2,1,1,4,4};
        int result = function(arr);
        System.out.println(result);
    }
}
 //package arrayEasy;
//
//import java.util.HashMap;
//
//public class prac {
//    public static int function(int[] arr){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num: arr) {
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//        for (int i: arr) {
//            if(map.get(i) == 1){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] arr = {2,1,1,4,4};
//        int result = function(arr);
//        System.out.println(result);
//    }
//}