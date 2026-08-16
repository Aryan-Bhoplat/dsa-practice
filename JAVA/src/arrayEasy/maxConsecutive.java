package arrayEasy;

public class maxConsecutive {
    public static int function(int[] arr){
        int count = 0;
        int maxi = 0;

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == 1){
                count++;

            }
            else if(arr[i] == 0){
                count = 0;
            }
            if ( count > maxi){
                maxi = count;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 1, 1, 1};
        System.out.println(function(arr));
    }

}
