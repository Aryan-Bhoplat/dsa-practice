package arrays;

public class findingLargestElement {
    public static void main(String[] args) {
        int[] arr = {45, 12, 98, 3, 67, 21, 89, 54};
        int result = largestElement(arr);
        System.out.println(result);
    }
    public static int largestElement(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
