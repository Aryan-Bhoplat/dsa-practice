package arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,2,0 ,10};
        example(arr);
    }
    public static void example(int[] arr){
        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return;
        }

        for (int i = j+1; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}