package arrayEasy;

public class arraySortedOrNot {
    static boolean function(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //int[] arr = {5,3,2,1,4};
        int[] arr = {};
        System.out.println(function(arr));
    }
}
