package arrays;

public class checkingSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {7,4,2,8,9};
        boolean result = arraySortChecking(arr);
        System.out.println(result);
    }
    public static boolean arraySortChecking(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

}
