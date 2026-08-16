package patterPractice;

public class isoscelesTriangle {
    public static void main(String[] args) {
ex(5);
    }
    public static void ex(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
