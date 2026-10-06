package arrays;

public class maximumConsecutiveOnes {
    public static int function(int[] nums){
        int maxi = 0,count = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxi = Math.max(maxi,count);
            }else{
                count = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1};
        int result = function(arr);
        System.out.println(result);
    }
}
