package arrayMedium;

import java.util.Arrays;

public class spiralTraversalOfMatrix {
    public static void function(int[][] arr){
        int n = arr.length;
        int top = 0, left = 0;
        int bottom = n-1, right = n-1;

        while( top <= bottom && left <= right){
            for (int i = left; i <= right ; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom ; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            for (int i = right; i >= left ; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
            for (int i = bottom; i >= top ; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;

        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        function(arr);

    }
}
