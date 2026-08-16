package arrayMedium;

public class buySellStocks {
    public static int function(int[] arr){
        int best = 0;
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < Smallest){
                Smallest = arr[i];
            }
            int curr = arr[i] - Smallest;
            if( curr > best){
                best = curr;
            }
        }
        return best;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 4, 3, 1, 5};
        int result = function(arr);
        System.out.println(result);
    }
}
