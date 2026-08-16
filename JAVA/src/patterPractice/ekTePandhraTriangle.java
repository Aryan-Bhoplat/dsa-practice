package patterPractice;

public class ekTePandhraTriangle {
    public static void main(String[] args) {
        ex(5);
    }

    public static void ex(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x);
                x = x+1;
            }
            System.out.println();
        }
    }}

