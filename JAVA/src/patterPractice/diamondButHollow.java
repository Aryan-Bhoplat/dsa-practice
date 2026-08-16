package patterPractice;

public class diamondButHollow {
    public static void main(String[] args) {
        ex(5);
    }
    public static void ex(int n){

        for (int i = 0; i < n; i++) {
            // stars
            for (int j = n-i; j > 0; j--) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = n-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // spaces

            for (int j = 0; j < 2*(n-(i+1)); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
