package arrayMedium;

import java.util.Arrays;

public class setMatrixToZero {
    public static int[][] function(int[][]arr){
        int n = arr.length;
        int m = arr[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < n; i++) {
            if(arr[i][0] == 0){
                firstColZero = true;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if(arr[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }


        if(firstColZero){
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
        if(firstRowZero){
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }

//        boolean[] rows = new boolean[arr.length];
//        boolean[] cols = new boolean[arr[0].length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (arr[i][j] == 0){
//                    rows[i] = true;
//                    cols[j] = true;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if( rows[i] || cols[j]){
//                    arr[i][j] = 0;
//                }
//            }
//        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}
        };
        System.out.println(Arrays.deepToString(arr));
        int[][] result = function(arr);
        System.out.println(Arrays.deepToString(result));
    }
}
