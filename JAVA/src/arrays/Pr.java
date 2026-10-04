package arrays;

import java.util.Arrays;

public class Pr {
    public static int[][] function(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for (int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));
        int[][] result = function(matrix);
        System.out.println(Arrays.deepToString(result));
    }
}
