//package arrayHard;
//
//public class majorityElementsII {
//    public static int function(int[] arr){
//        int n = arr.length;
//        int element = 0;
//        int count  = 0;
//        for (int i = 0; i < n; i++) {
//            if(count == 0){
//                count = 1;
//                element = arr[i];
//            } else if(element == arr[i]){
//                count++;
//            }
//            else {
//                count--;
//            }
//        }
//        int cnt = 0;
//        for(int i: arr){
//            if( i == element){
//                cnt++;
//            }
//        }
//        if(cnt > n/3){
//            return element;
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,1,1};
//        int result = function(arr);
//
//        System.out.println(result);
//    }
//}
