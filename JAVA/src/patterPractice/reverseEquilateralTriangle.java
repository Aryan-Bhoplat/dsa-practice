package patterPractice;

public class reverseEquilateralTriangle {
    public static void main(String[] args) {
        ex(5);
    }
    public static void ex(int n){
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 2*n-(2*i+1); j > 0; j--) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
