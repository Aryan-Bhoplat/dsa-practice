package arrayMedium;

public class kadane {
    public static int function(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int prev_sum = 0;

        for (int i =0; i < arr.length;i++){
            prev_sum += arr[i];
            if(prev_sum > maxi){
                maxi = prev_sum;
            }
            if (prev_sum < 0){
                prev_sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {-3,-2,-2,-3};
        int[] arr2 = {2, 3, 5, -2, 7, -4};
        int result = function(arr);
        System.out.println(result);
        int res2 = function(arr2);
        System.out.println(res2);
    }
}
