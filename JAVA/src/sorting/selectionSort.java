package sorting;
//Repeatedly finds the smallest element and puts it in its correct position.

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        for(int k: arr){
            System.out.print(k+" ");
        }

        for (int i = 0; i < arr.length- 1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if( arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println();
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
}
