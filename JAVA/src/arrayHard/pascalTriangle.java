package arrayHard;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
//    public static long function(int r,int c){
//        int n = r - 1;
//        int k = c - 1;
//
//        long result = 1;
//
//        for (int i = 0; i < k; i++) {
//            result *= (n - i);
//            result /= (i + 1);
//        }
//
//        return result;
//    }

    public static List<List<Integer>> pascal(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if(j == 0 || j == i){
                    row.add(1);
                } else {
                    row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {
        int numRows = 5;

        List<List<Integer>> result = pascal(numRows);

        for (int i = 0; i < result.size(); i++) {
            for (int space = 0; space < numRows - i; space++) {
                System.out.print(" ");
            }
            for (int num : result.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
