package arrayEasy;

public class removingDuplicatesFromArray {
    static int function(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int check = 0;
        for (int i = 0; i < arr.length; i++){
            if( arr[check] != arr[i]){
                check++;
                arr[check] = arr[i];
            }
        }
        return check+1;

    }
    public static void main(String[] args) {
        int[] arr = {};
        int result = function(arr);
        System.out.println(result);
        for (int i = 0; i < result;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
