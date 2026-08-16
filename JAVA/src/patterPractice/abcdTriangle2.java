package patterPractice;

public class abcdTriangle2 {
    public static void main(String[] args) {
        ex(5);
    }

    public static void ex(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A'+i));
            }
            System.out.println();
        }
    }
}
