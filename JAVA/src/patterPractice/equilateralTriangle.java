package patterPractice;

public class equilateralTriangle {
    public static void main(String[] args) {
        ex(5);
    }
    public static void ex(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
