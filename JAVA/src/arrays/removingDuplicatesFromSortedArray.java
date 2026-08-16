package arrays;

public class removingDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5,10};
        int result= removingProcess(arr);
        System.out.println(result);
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int removingProcess(int[] arr){
        int k = 0;
        for (int i = 1; i < arr.length ; i++){
            if (arr[k] != arr[i]){
                k++;
                arr[k] = arr[i];
            }

        }
        return k+1;
    }
}
