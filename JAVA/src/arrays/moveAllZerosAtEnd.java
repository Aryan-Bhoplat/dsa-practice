package arrays;

public class moveAllZerosAtEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 0};
        problem(arr);
    }
    public static void problem(int[] arr){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if ( j == -1){
            return;
        }
        for (int i = j+1; i < arr.length; i++) {
                    if (arr[i] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        j++;
                    }
        }
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
}



//public static void moveZeros(int[] arr) {
//
//    int j = -1;
//
//    // Find the first zero
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == 0) {
//            j = i;
//            break;
//        }
//    }
//
//    // No zeros present
//    if (j == -1)
//        return;
//
//    // Move non-zero elements forward
//    for (int i = j + 1; i < arr.length; i++) {
//
//        if (arr[i] != 0) {
//
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            j++;
//        }
//    }
//}