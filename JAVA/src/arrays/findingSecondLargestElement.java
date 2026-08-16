//package arrays;
//
//public class findingSecondLargestElement {
//    public static void main(String[] args) {
//        int[] arr = {45, 12, 98, 3, 67, 21, 89, 54};
//        int result = secondLargest(arr);
//        System.out.println(result);
//    }
//
//    public static int secondLargest(int[] arr) {
//        int largest = arr[0];
//        int secLargest = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if ( arr[i] > largest && arr[i] > secLargest){
//                secLargest = largest;
//                largest = arr[i];
//            }
//            else if (arr[i] > secLargest && arr[i] != largest){
//                secLargest = arr[i];
//            }
//        }
//        return secLargest;
//    }
//}

package arrays;

public class findingSecondLargestElement{
    public static void main(String[] args) {
        int[] arr = {98, 67, 21, 89, 54};
        int result = demo(arr);
        System.out.println("Second largest element is: "+result);
    }
    public static int demo(int[] arr){
        int max = arr[0];
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                second = max;
                max = arr[i];
            }
            else if (arr[i] != max && arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }

}