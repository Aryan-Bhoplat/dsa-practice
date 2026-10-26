package arrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class revision {
    public static void main(String[] args) {
        int[] nums =  {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);

        int[] nums2 = {1,0,2,1,0};
        sortColors(nums2);
        System.out.println(Arrays.toString(nums2));
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n-2; i++){
            if( i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if( sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }

                    left++;
                    right--;
                } else if ( sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void sortColors(int[] nums){
        int n = nums.length;

        int low = 0, mid = 0;
        int high = n - 1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            } else if( nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }


}
