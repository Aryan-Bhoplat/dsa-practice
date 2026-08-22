package arrayHard;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static long function(int r,int c){
        int n = r - 1;
        int k = c - 1;

        long result = 1;

        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }
    public static void main(String[] args) {
        int r = 5, c = 3;
        System.out.println(function(r,c));
    }
}
