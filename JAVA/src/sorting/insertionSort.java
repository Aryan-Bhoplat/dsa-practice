package sorting;
//Takes each element and inserts it into its correct position in the already-sorted part.
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        for(int k: arr){
            System.out.print(k+" ");
        }
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while ( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println();
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
}
