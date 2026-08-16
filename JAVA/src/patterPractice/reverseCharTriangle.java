package patterPractice;

public class reverseCharTriangle {
    public static void main(String[] args) {
        ex(5);
    }
    public static void ex(int n){
        for (int i = 0; i < n; i++) {
            // Pattern
            for (char ch = (char)('E' - i); ch <= 'E';ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
