package arrayEasy;

public class secondLargetElementInArray {
    static int function(int[] arr){
        int max = arr[0];
        int second= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                second = max;
                max = arr[i];
            }
            if(arr[i] > second && arr[i] < max){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 45, 19};
        System.out.println("Second Largest: "+function(arr));
    }
}
