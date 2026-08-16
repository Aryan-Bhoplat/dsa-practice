package basicRecursion;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for( int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        rev(arr,0,arr.length-1);
        for( int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void rev(int[] arr, int p1, int p2){
        if ( p1 >= p2){
               return;
        }
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;

        rev(arr,p1+1,p2-1);

    }
}


// Better Approach

//public class reverseAnArray {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        for (int k : arr) {
//            System.out.print(k+" ");
//        }
//        int[] result = rev(arr);
//        System.out.println();
//        for (int j : result) {
//            System.out.print(j+" ");
//        }
//    }
//    public static int[] rev(int[] arr){
//        int p1 = 0;
//        int p2 = arr.length -1;
//        while (p1 < p2){
//            int temp = arr[p1];
//            arr[p1] = arr[p2];
//            arr[p2] = temp;
//
//            p1++;
//            p2--;
//        }
//        return arr;
//    }
//}




// Brute Force

//public class reverseAnArray {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] result = rev(arr);
//        for (int j : result) {
//            System.out.println(j);
//        }
//    }
//    public static int[] rev(int[] arr){
//        int len = arr.length;
//        int[] newArr = new int[len];
//        for (int i = 0; i < len; i++) {
//            newArr[i] = arr[len-i-1];
//        }
//        return newArr;
//    }
//}
