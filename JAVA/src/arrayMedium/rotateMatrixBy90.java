package arrayMedium;

import java.util.Arrays;

public class rotateMatrixBy90 {
    public static int[][] function(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i;j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n / 2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(arr));
        int[][] result = function(arr);
        System.out.println(Arrays.deepToString(result));
    }
}
