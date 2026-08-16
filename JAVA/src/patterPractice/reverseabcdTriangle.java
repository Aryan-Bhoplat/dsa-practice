package patterPractice;

public class reverseabcdTriangle {
    public static void main(String[] args) {
        ex(5);
    }

    public static void ex(int n){

        for (int i = n; i >= 0; i--) {
            int num = 0;
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A'+j));
            }
            System.out.println();
        }
    }
}
