package patterPractice;

public class twentyTwo {
    public static void main(String[] args) {
        ex(3);
    }
    public static void ex(int n){
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int right = 2*(n-1)-j;
                int bottom = 2*(n-1) -i;
                int min = Math.min(Math.min(top,bottom), Math.min(left,right));
                System.out.print(1+min + " ");
            }
            System.out.println();
        }
    }
}
