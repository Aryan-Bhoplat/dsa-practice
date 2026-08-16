package patterPractice;

public class equiAbcdTriangle {
    public static void main(String[] args) {
        ex(4);
    }
    public static void ex(int n){
        for (int i = 0; i < n; i++) {
            // Spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // Pattern
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print((ch));
                if(j <= breakpoint){
                    ch++;
                } else {
                    ch--;
                }

            }
            // Spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
