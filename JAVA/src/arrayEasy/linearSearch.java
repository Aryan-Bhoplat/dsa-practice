package arrayEasy;

public class linearSearch {
    static int function(int[] arr){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 6){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,9,8,6};
        System.out.println(function(arr));


    }
}
